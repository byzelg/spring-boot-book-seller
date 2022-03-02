package com.sha.springbootbookseller.repository.projection;


import java.time.LocalDateTime;

//Springte projectionlar, arayüzlerle tanimlanir. Cunku projectionlar select sorgusu ile calisir ve sadece getter metodlarina ihtiyac duyarlar
public interface IPurchaseItem
{
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
