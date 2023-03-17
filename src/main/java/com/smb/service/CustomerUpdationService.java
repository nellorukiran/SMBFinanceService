package com.smb.service;

import com.smb.controller.dao.CustomerUpdationMapping;

public interface CustomerUpdationService {

	CustomerUpdationMapping customerUpdation(Long cusID, CustomerUpdationMapping customerUpdationMapping);

}
