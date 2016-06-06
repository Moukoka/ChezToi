package com.mouks.rosie.cheztoi.services.Impl;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import com.mouks.rosie.cheztoi.conf.App;
import com.mouks.rosie.cheztoi.domain.CustomerDetails;
import com.mouks.rosie.cheztoi.repository.CustomerRepository;
import com.mouks.rosie.cheztoi.repository.Impl.CustomerRepositoryImpl;
import com.mouks.rosie.cheztoi.services.CustomerService;

/**
 * Created by Rosie on 2016/06/06.
 */
public class CustomerServiceImpl extends IntentService implements CustomerService {

    private final CustomerRepository repo;
    private static final String ACTION_ADD = "com.mouks.rosie.cheztoi.services.Impl.action.ADD";
    private static final String EXTRA_ADD = "com.mouks.rosie.cheztoi.services.Impl.extra.ADD";

    private static final String ACTION_RESET = "com.mouks.rosie.cheztoi.services.Impl.action.RESET";
    private static CustomerServiceImpl service = null;

    public CustomerServiceImpl() {
        super("CandidateServiceImpl");
        repo = new CustomerRepositoryImpl(App.getAppContext());
    }


    public static CustomerServiceImpl getInstance(){
        if(service==null)
            service = new CustomerServiceImpl();
        return service;
    }
    public CustomerServiceImpl(String name, CustomerRepository repo) {
        super(name);
        this.repo = repo;
    }

    @Override
    public void addCustomer(Context context, CustomerDetails customer) {

        Intent intent = new Intent(context, CustomerServiceImpl.class);
        intent.setAction(ACTION_ADD);
        intent.putExtra(EXTRA_ADD, customer);
        context.startService(intent);
    }

    @Override
    public void resetCustomer(Context context) {

        Intent intent = new Intent(context, CustomerServiceImpl.class);
        intent.setAction(ACTION_RESET);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null){
            final String action = intent.getAction();
            if (ACTION_ADD.equals(action)){
                final CustomerDetails customerDetails = (CustomerDetails) intent.getSerializableExtra(EXTRA_ADD);
                saveCandidate(customerDetails);
            }else if (ACTION_RESET.equals(action)){
                resetCustomerRecords();
            }
        }

    }

    private void resetCustomerRecords() {
        repo.deleteAll();
    }

    private void saveCandidate(CustomerDetails customerDetails) {
        CustomerDetails customer = new CustomerDetails.Builder()
                .id(Long.valueOf(customerDetails.getCustomerId())).customer(customerDetails.getCustomerId()).name(customerDetails.getName())
                .username(customerDetails.getUsername()).password(customerDetails.getPassword()).age(customerDetails.getAge()).build();
        CustomerDetails saveCustomer = repo.save(customer);
    }
}
