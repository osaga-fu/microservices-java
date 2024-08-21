package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - input mobile number
     * @return Accounts Details based on a given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);
}
