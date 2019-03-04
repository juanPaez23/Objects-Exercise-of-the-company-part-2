/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import empleados.Aplicacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Páez
 */
public class DatosEmpleados {
  
    public static void main(String[] args) {
        String decision;
        int opcion;
        
        Aplicacion employee1=new Aplicacion();
        Aplicacion employee2=new Aplicacion();
        Aplicacion employee3=new Aplicacion();
        Aplicacion employee4=new Aplicacion();
        Aplicacion employee5=new Aplicacion();
        
       
        employee1.setName(JOptionPane.showInputDialog("Digite el nombre del primer empleado"));
        employee1.setAge(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del primer empleado")));
        employee1.setAddress(JOptionPane.showInputDialog("Digite la dirección del primer empleado"));
        employee1.setNumberPhone(Long.parseLong(JOptionPane.showInputDialog("Digite el número telefonico del primer empleado")));
        
        employee2.setName(JOptionPane.showInputDialog("Digite el nombre del segundo empleado"));
        employee2.setAge(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del segundo empleado")));
        employee2.setAddress(JOptionPane.showInputDialog("Digite la dirección del segundo empleado"));
        employee2.setNumberPhone(Long.parseLong(JOptionPane.showInputDialog("Digite el número telefonico del segundo empleado")));
        
        employee3.setName(JOptionPane.showInputDialog("Digite el nombre del tercer empleado"));
        employee3.setAge(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del tercer empleado")));
        employee3.setAddress(JOptionPane.showInputDialog("Digite la dirección del tercer empleado"));
        employee3.setNumberPhone(Long.parseLong(JOptionPane.showInputDialog("Digite el número telefonico del tercer empleado")));
        
        employee4.setName(JOptionPane.showInputDialog("Digite el nombre del cuarto empleado"));
        employee4.setAge(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del cuarto empleado")));
        employee4.setAddress(JOptionPane.showInputDialog("Digite la dirección del cuarto empleado"));
        employee4.setNumberPhone(Long.parseLong(JOptionPane.showInputDialog("Digite el número telefonico del cuarto empleado")));
        
        employee5.setName(JOptionPane.showInputDialog("Digite el nombre del quinto empleado"));
        employee5.setAge(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del quinto empleado")));
        employee5.setAddress(JOptionPane.showInputDialog("Digite la dirección del quinto empleado"));
        employee5.setNumberPhone(Long.parseLong(JOptionPane.showInputDialog("Digite el número telefonico del quinto empleado")));
        
        
        decision=JOptionPane.showInputDialog("Desea imprimir la información de algún empleado??  SI/NO");
             
        if(decision.equalsIgnoreCase("si")){
         
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Información Empleados \n Digite el numero del empleado del cual desea imprimir la información \n 1). Empleado 1 \n 2). Empleado 2 \n 3). Empleado 3 \n 4). Empleado 4 \n 5). Empleado 5 \n 0). Salir \n "));
            
            switch(opcion){
            
                case 0: break;
                
                case 1: JOptionPane.showMessageDialog(null," Nombre: " +employee1.getName() +"\n Edad: " +employee1.getAge() +"\n Direccion: " +employee1.getAddress() +"\n Número telefónico: " +employee1.getNumberPhone());
                break;
                
                case 2: JOptionPane.showMessageDialog(null," Nombre: " +employee2.getName() +"\n Edad: " +employee2.getAge() +"\n Direccion: " +employee2.getAddress() +"\n Número telefónico: " +employee2.getNumberPhone());
                break;
                
                case 3: JOptionPane.showMessageDialog(null," Nombre: " +employee3.getName() +"\n Edad: " +employee3.getAge() +"\n Direccion: " +employee3.getAddress() +"\n Número telefónico: " +employee3.getNumberPhone());
                break;
                
                case 4: JOptionPane.showMessageDialog(null," Nombre: " +employee4.getName() +"\n Edad: " +employee4.getAge() +"\n Direccion: " +employee4.getAddress() +"\n Número telefónico: " +employee4.getNumberPhone());
                break;
                
                case 5: JOptionPane.showMessageDialog(null," Nombre: " +employee5.getName() +"\n Edad: " +employee5.getAge() +"\n Direccion: " +employee5.getAddress() +"\n Número telefónico: " +employee5.getNumberPhone());
                break;
            }
        }
        
    }
}
