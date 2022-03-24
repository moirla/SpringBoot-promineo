package com.promineotech.jeep.service;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public interface JeepSalesService {
  
  //JeepSalesDao dao = new JeepSalesDao();

  /**
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(JeepModel model, String trim);

}
