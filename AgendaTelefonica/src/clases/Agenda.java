/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author USM
 */
public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void add(Contacto c) {
        contactos.add(c);
    }

    public ArrayList<Contacto> getAll() {
        return contactos;
    }

    public ArrayList<Contacto> getByGrupo(Grupo g) {
        ArrayList<Contacto> contactosGrupo = new ArrayList<>();

        for (Contacto contacto : contactos) {
            if (contacto.getGrupo() == g) {
                contactosGrupo.add(contacto);
            }
        }
        return contactosGrupo;
    }

}
