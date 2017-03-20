package com.myspring.dao;

import com.myspring.model.Contact;

import java.util.List;

/**
 * Created by D on 3/4/2017.
 */
public interface ContactDao {
    public void saveOrUpdate(Contact contact);

    public void delete(int contactId);

    public Contact get(int contactId);

    public List<Contact> list();
}
