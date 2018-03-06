package pl.javastart.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping ("/testy")
public class MainController {

    @RequestMapping ("/test1")
    @ResponseBody
    public String powitanie (HttpServletRequest request){


        String wyswietl="Cześć tu Agnieszka, wszystko działa. Adres IP: "+request.getRemoteAddr();

        System.out.println("ktoś wszedł na stronę testy/test1"); // to info dla mnie w konsoli, ktoś tego nie widzi

        return wyswietl;

    }
}
