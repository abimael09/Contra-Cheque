package contra_cheque;

import javax.swing.*;

public class Contra_Cheque{
    
    public static void main(String[] args){
        
        String nome = JOptionPane.showInputDialog("Informe seu Nome:");
        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Informe seu Salário Bruto:"));
        double taxaINSS = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa de seu INSS:"));
        double taxaIR = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa IR:"));
        
        double descontoINSS = salarioBruto * taxaINSS / 100;
        
        if(taxaINSS <= 24){
            JOptionPane.showMessageDialog(null, "Desconto de INSS = " + descontoINSS+"0 R$");
        }else{
            JOptionPane.showMessageDialog(null, "A taxa de INSS ultrapassou de 240,00 R$. Dessa forma, \n"
                    + " não será possível continuar a Operação.");
        }
        
        double descontoIR = salarioBruto * taxaIR / 100;
        JOptionPane.showMessageDialog(null, "Desconto de IR = " + descontoIR+"0 R$");
        
        double salarioLiquido = salarioBruto - descontoIR - descontoINSS;
        
        JOptionPane.showMessageDialog(null, "Funcionário(a): "+nome+"\nSalário Bruto = "+salarioBruto+"0 R$\nDesconto INSS = "
                +descontoINSS+"0 R$\n"+ "Desconto IR = "+descontoIR+"0 R$\nSalário Líquido Final = "+salarioLiquido+"0 R$");
        
    }
}