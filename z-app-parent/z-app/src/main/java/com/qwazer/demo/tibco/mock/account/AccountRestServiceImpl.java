package com.qwazer.demo.tibco.mock.account;

import org.springframework.stereotype.Service;

import javax.servlet.UnavailableException;
import java.util.List;


@Service
public class AccountRestServiceImpl implements AccountRestService{


    @Override
    public Object accounts(List<Object> list) throws UnavailableException {
        return null;
    }
}
