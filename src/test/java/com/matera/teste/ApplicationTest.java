/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.matera.teste;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import com.matera.model.Funcionario;
import com.matera.controller.Controller;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.util.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = Controller.class)
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testaNomeDoFunc(){
        Funcionario f1 = new Funcionario("Gabriel");
        Assert.assertEquals("Gabriel",f1.getNome());
    }


    @Test
    public void testaTempoDeCasa(){
        Funcionario p1 = new Funcionario("Joao");
        Funcionario p2 = new Funcionario("Pedro");
        Funcionario p3 = new Funcionario("Antonio");
        Funcionario p4 = new Funcionario("Paulo");
        Funcionario p5 = new Funcionario("Marcos");
        Funcionario p6 = new Funcionario("Ruan");
        Funcionario p7 = new Funcionario("Carlos");



        List<Funcionario> listaNego = new ArrayList<Funcionario>();
        listaNego.add(p1);
        listaNego.add(p2);
        listaNego.add(p3);
        listaNego.add(p4);
        listaNego.add(p5);
        listaNego.add(p6);
        listaNego.add(p7);


        System.out.println(listaNego.get(4));

        p5.setIdade(25);
        p5.setMatricula(555355);

        String temp = "O valor é: " + listaNego.get(4);
        System.out.println(temp);
        Assert.assertEquals("O valor é: Funcionario{idade=25, matricula=555355, nome='Marcos'}",temp);
    }




//    @Test
//    public void homePage() throws Exception {
//            // N.B. jsoup can be useful for asserting HTML content
//            mockMvc.perform(get("/index.html"))
//                    .andExpect(content().string(containsString("Get your greeting")));
//        }
//
//        @Test
//        public void greeting() throws Exception {
//            mockMvc.perform(get("/greeting"))
//                    .andExpect(content().string(containsString("Hello, World!")));
//        }
//
//        @Test
//        public void greetingWithUser() throws Exception {
//            mockMvc.perform(get("/greeting").param("name", "Greg"))
//                    .andExpect(content().string(containsString("Hello, Greg!")));
//    }

}
