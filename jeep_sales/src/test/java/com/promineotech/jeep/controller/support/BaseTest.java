/**
 * 
 */
package com.promineotech.jeep.controller.support;

import org.springframework.boot.web.server.LocalServerPort;
import lombok.Getter;

public class BaseTest {
  
  @LocalServerPort
  @Getter
   int serverPort;
  
  /*String GetBaseUri() {
    return String.format("http://localhost:%d/jeeps", serverPort);
 } 
 */
  
}
