package com.currencyconverter.curcov.service;

import com.currencyconverter.curcov.entity.Currency;
import com.currencyconverter.curcov.model.CurrencyDTO;
import com.currencyconverter.curcov.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CurrencyService {

    @Autowired
    private Repo repo;

    public double currencyConverter(CurrencyDTO currencyDTO) {

        /*Map<String,Double> currency=new HashMap();
        currency.put("usd",80.0);
        currency.put("csd",30.0);
        currency.put("ksd",25.0);
        currency.put("psr",10.0);
        currency.put("all",5.0);
        currency.put("inr",1.0);*/

        String cur1 =currencyDTO.getfCountry();

        String cur2 =currencyDTO.gettCountry();

        Double amt= currencyDTO.getValue();

     //   double a=0,b=0;


        Double ff=repo.findByfCountry(cur1).getValue();
        Double tt=repo.findByfCountry(cur2).getValue();

//        Double tt = repo.findById(cur1).get().getValue();
//        Double ff = repo.findById(cur2).get().getValue();
        System.out.println(ff);
        System.out.println(tt);


       /* for (Map.Entry<String,Double> s:currency.entrySet())
        {
            if(s.getKey().equalsIgnoreCase(cur1))
            {
                a=s.getValue();
            }
            if(s.getKey().equalsIgnoreCase(cur2))
            {
                b=s.getValue();
            }
        }*/
        Double ans=((ff/tt)*amt);

        return  ans;

    }


    public List<String> countryList()
    {
       List<String> list = new ArrayList<>();
       for (int i = 0; i<repo.findAll().size();i++){
           list.add(repo.findAll().get(i).getFCountry());
       }

        return list;
    }

}

