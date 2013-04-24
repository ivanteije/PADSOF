/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Ventanas;

import GUI.Recursos.SpringUtilities;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.*;

/**
 *
 * @author ivan
 */
public class ModificarPass extends Ventana{
    private JButton buscar;
    private JTextField idInput;
    
    private JTextField name;
    private JTextField surname;
    private JTextField dni;
    private JTextField fechaNac;    
    
    private JTextField id;
    private JTextField pass;
    
    private JTextField newPass;
    private JTextField repeatNewP;

    private JButton atras;
    private JButton borrar;
    
    
    public ModificarPass(BookingFrame padre, String nombre){
        super(new SpringLayout(), nombre, padre, 550, 550);
        
        this.iniBusqueda();
        this.iniForm();
        
        this.setBorder(BorderFactory.createTitledBorder(nombre));     
        SpringUtilities.makeCompactGrid(this, 2, 1, 9, 9, 9, 20);
    }
    
    private void iniBusqueda(){
        JPanel busqueda = new JPanel(new FlowLayout());
        busqueda.setBorder(BorderFactory.createTitledBorder("Búsqueda de Vendedor"));
        
        JLabel idlab = new JLabel("Introduzca el ID del Vendedor: ");
        idInput = new JTextField(10);
        idlab.setLabelFor(idInput);
        idlab.setVisible(true);
        idInput.setVisible(true);
        
        buscar = new JButton("Buscar");
        
        busqueda.add(idlab);
        busqueda.add(idInput);
        busqueda.add(buscar);
        JPanel aux = new JPanel(new GridBagLayout());
        aux.add(busqueda);
        busqueda= aux;
        this.add(busqueda);
    }
    
    private void iniForm(){
        JPanel form = new JPanel(new SpringLayout());
        form.setBorder(BorderFactory.createTitledBorder("Datos del Vendedor"));
        
        this.name = new JTextField(10);
        JLabel nom = new JLabel("Nombre: ");
        nom.setLabelFor(name);
        form.add(nom);
        form.add(name);  
        name.setEnabled(false);
                
        this.surname = new JTextField();
        JLabel apel = new JLabel("Apellidos: ");
        apel.setLabelFor(surname);
        form.add(apel);
        form.add(surname);
        surname.setEnabled(false);
        
        this.dni = new JTextField();
        JLabel dnilab = new JLabel("DNI: ");
        dnilab.setLabelFor(dni);
        form.add(dnilab);
        form.add(dni);
        dni.setEnabled(false);
        
        this.fechaNac = new JTextField();
        JLabel fecha = new JLabel("Fecha de Nacimiento: ");
        fecha.setLabelFor(fechaNac);
        form.add(fecha);
        form.add(fechaNac);
        fechaNac.setEnabled(false);
        
   
        this.id = new JTextField();
        JLabel idlab = new JLabel("ID Vendedor: ");
        idlab.setLabelFor(id);
        form.add(idlab);
        form.add(id);
        id.setEnabled(false);
        
        this.pass = new JTextField();
        JLabel contra = new JLabel("Contraseña: ");
        contra.setLabelFor(pass);
        form.add(contra);
        form.add(pass);
        pass.setEnabled(false);
      
        
        SpringUtilities.makeCompactGrid(form, 3, 4, 8, 8, 10, 20);
        form.setVisible(true);
        
        
        
        JPanel medio = new JPanel(new SpringLayout());
        medio.setBorder(BorderFactory.createTitledBorder("Cambio de Contraseña"));
        
        JLabel nueva = new JLabel("Introduzca la nueva contraseña: ");
        this.newPass = new JTextField();
        nueva.setLabelFor(newPass);
        medio.add(nueva);
        medio.add(newPass);
        
        JLabel repNueva = new JLabel("Repita la nueva contraseña: ");
        this.repeatNewP = new JTextField();
        repNueva.setLabelFor(repeatNewP);
        medio.add(repNueva);
        medio.add(repeatNewP);
                
        SpringUtilities.makeCompactGrid(medio, 2, 2, 9, 9, 9, 9);
        
        JPanel abajo = new JPanel(new FlowLayout());
        this.atras = new JButton("Atrás");
        atras.setVisible(true);
        this.borrar = new JButton("Modificar Contraseña");
        borrar.setVisible(true);
        abajo.add(atras);
        abajo.add(borrar);
        
        abajo.setVisible(true);
        
        JPanel general = new JPanel();
        general.setLayout(new BoxLayout(general, BoxLayout.Y_AXIS));
        general.add(form);
        general.add(Box.createRigidArea(new Dimension(100, 50)));       
        general.add(medio);
        general.add(Box.createRigidArea(new Dimension(100, 100)));        
        general.add(Box.createVerticalGlue());
        general.add(abajo);

        general.setVisible(true);
        this.add(general);
    }

    public JButton getAtras() {
        return atras;
    }

    public void setAtras(JButton atras) {
        this.atras = atras;
    }

    public JButton getBorrar() {
        return borrar;
    }

    public void setBorrar(JButton borrar) {
        this.borrar = borrar;
    }

    public JButton getBuscar() {
        return buscar;
    }

    public void setBuscar(JButton buscar) {
        this.buscar = buscar;
    }

    public JTextField getDni() {
        return dni;
    }

    public void setDni(JTextField dni) {
        this.dni = dni;
    }

    public JTextField getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(JTextField fechaNac) {
        this.fechaNac = fechaNac;
    }


    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public JTextField getIdInput() {
        return idInput;
    }

    public void setIdInput(JTextField idInput) {
        this.idInput = idInput;
    }

    public JTextField getNameT() {
        return name;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JTextField getNewPass() {
        return newPass;
    }

    public void setNewPass(JTextField newPass) {
        this.newPass = newPass;
    }

    public JTextField getPass() {
        return pass;
    }

    public void setPass(JTextField pass) {
        this.pass = pass;
    }

    public JTextField getRepeatNewP() {
        return repeatNewP;
    }

    public void setRepeatNewP(JTextField repeatNewP) {
        this.repeatNewP = repeatNewP;
    }

    public JTextField getSurname() {
        return surname;
    }

    public void setSurname(JTextField surname) {
        this.surname = surname;
    }
    
    
    
    @Override
    public String claveVentana(String textoBoton) {
        return "Gestión";
    }
    
}
