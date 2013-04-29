package trabalho2calcbean;

public class Trabalho2CalcBean {

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();  // Cria frame
        CalcBean bean = new CalcBean(); // Instancia o bean
        // Alterar as propriedades que julgar necessárias aqui!
        frame.add(bean);  // Adiciona bean ao frame
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);  // Exibe o frame
    }
}
