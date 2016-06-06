package com.mouks.rosie.cheztoi.test;

import com.mouks.rosie.cheztoi.domain.Personel;
import com.mouks.rosie.cheztoi.factories.PersonelFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/05/31.
 */
public class PersonelFactoryTest extends TestCase {
    public void testCreate() throws Exception {

        Personel personel = PersonelFactory.getPersonel("Helene","DuBois");
        Assert.assertEquals("Helene", personel.getName());
    }

    public void testUpdate() throws Exception{
        Personel personel = PersonelFactory.getPersonel("Helene", "DuBois");
        Personel newPersonel = new Personel.Builder().copy(personel).surname("Du-Bois").build();
        Assert.assertEquals("Du-Bois", newPersonel.getSurname());
    }
}
