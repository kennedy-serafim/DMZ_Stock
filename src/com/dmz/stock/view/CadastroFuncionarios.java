package com.dmz.stock.view;

import com.dmz.stock.auxiliar.Expressoes;
import configuracoes.SystemMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author seraf
 */
public class CadastroFuncionarios extends javax.swing.JDialog {

    /**
     * Creates new form CadastroFuncionarios
     *
     * @param parent
     * @param modal
     */
    public CadastroFuncionarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        configuracoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanelConteudo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUserApelido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUserOtherName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jChooserDataNascimento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jRadioFeminino = new javax.swing.JRadioButton();
        jRadioMasculino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtUserBilheteIdentidade = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUserNUIT = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUserTelefone = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNumeroResidencia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox();
        asterisco1 = new javax.swing.JLabel();
        asterisco2 = new javax.swing.JLabel();
        asterisco3 = new javax.swing.JLabel();
        asterisco5 = new javax.swing.JLabel();
        asterisco6 = new javax.swing.JLabel();
        asterisco7 = new javax.swing.JLabel();
        asterisco8 = new javax.swing.JLabel();
        asterisco9 = new javax.swing.JLabel();
        asterisco10 = new javax.swing.JLabel();
        asterisco11 = new javax.swing.JLabel();
        asterisco12 = new javax.swing.JLabel();
        asterisco13 = new javax.swing.JLabel();
        asterisco15 = new javax.swing.JLabel();
        asterisco16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        asteriscoInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Funcionários ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelConteudo.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account-logout-16.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-user-3-24.png"))); // NOI18N
        jButton2.setText("Gravar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(26, 118, 141));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list-ingredients-24.png"))); // NOI18N
        jButton3.setText("Lista de Funcionários");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("Os funcionários cadastrados por aqui não tem acesso ao sistema");

        jPanel3.setBackground(new java.awt.Color(26, 118, 141));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome do Funcionário:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtUserName.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtUserName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 263, 33));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apelido:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtUserApelido.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtUserApelido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUserApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserApelidoActionPerformed(evt);
            }
        });
        jPanel3.add(txtUserApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 200, 33));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Outro nome:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        txtUserOtherName.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtUserOtherName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtUserOtherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 190, 33));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data de Nascimento:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jChooserDataNascimento.setToolTipText("Ex: 01/01/2000");
        jChooserDataNascimento.setDateFormatString("dd - MM - yyyy");
        jChooserDataNascimento.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jPanel3.add(jChooserDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 218, 33));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Genero:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jRadioFeminino.setBackground(new java.awt.Color(26, 118, 141));
        jRadioFeminino.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jRadioFeminino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioFeminino.setText("Feminino");
        jRadioFeminino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jRadioFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 151, -1, 33));

        jRadioMasculino.setBackground(new java.awt.Color(26, 118, 141));
        jRadioMasculino.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jRadioMasculino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioMasculino.setText("Masculino");
        jRadioMasculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jRadioMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, 33));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bilhete de Identidade:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 116, -1, -1));

        txtUserBilheteIdentidade.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtUserBilheteIdentidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserBilheteIdentidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserBilheteIdentidadeFocusLost(evt);
            }
        });
        txtUserBilheteIdentidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserBilheteIdentidadeActionPerformed(evt);
            }
        });
        jPanel3.add(txtUserBilheteIdentidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 200, 33));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NUIT:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 116, -1, -1));

        try {
            txtUserNUIT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUserNUIT.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtUserNUIT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNUITFocusGained(evt);
            }
        });
        txtUserNUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNUITActionPerformed(evt);
            }
        });
        jPanel3.add(txtUserNUIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 190, 33));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefone:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 116, -1, -1));

        txtUserTelefone.setForeground(new java.awt.Color(26, 118, 141));
        try {
            txtUserTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+ (258) ## ### # ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUserTelefone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtUserTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserTelefoneActionPerformed(evt);
            }
        });
        jPanel3.add(txtUserTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 218, 33));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("E-mail: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));

        txtUserEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtUserEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserEmailFocusLost(evt);
            }
        });
        txtUserEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserEmailKeyReleased(evt);
            }
        });
        jPanel3.add(txtUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 314, 33));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nacionalidade:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 205, -1, -1));

        jComboBoxPais.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma nacionalidade...", "Moçambicana" }));
        jComboBoxPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jComboBoxPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, 33));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cidade actual:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));

        jComboBoxCidade.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma cidade...", "Maputo", "Matola", "Beira", "Nampula", "Chimoio", "Nacala", "Quelimane", "Tete", "Lichinga", "Xai-Xai", "Maxixe", "Manica", "Inhambane" }));
        jComboBoxCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jComboBoxCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, 33));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bairro:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        txtBairro.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jPanel3.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 254, 33));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Avenida ou Rua:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtRua.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });
        jPanel3.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 321, 249, 33));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Número de Residência:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, -1));

        txtNumeroResidencia.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jPanel3.add(txtNumeroResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 175, 33));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Departamento:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 372, -1, -1));

        jComboBoxDepartamento.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jComboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um Departamento..." }));
        jComboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartamentoActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 403, -1, 33));

        asterisco1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco1.setForeground(new java.awt.Color(255, 255, 255));
        asterisco1.setText("*");
        jPanel3.add(asterisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 30));

        asterisco2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco2.setForeground(new java.awt.Color(255, 255, 255));
        asterisco2.setText("*");
        jPanel3.add(asterisco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 30));

        asterisco3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco3.setForeground(new java.awt.Color(255, 255, 255));
        asterisco3.setText("*");
        jPanel3.add(asterisco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 10, 20));

        asterisco5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco5.setForeground(new java.awt.Color(255, 255, 255));
        asterisco5.setText("*");
        jPanel3.add(asterisco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 10, 30));

        asterisco6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco6.setForeground(new java.awt.Color(255, 255, 255));
        asterisco6.setText("*");
        jPanel3.add(asterisco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 10, 20));

        asterisco7.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco7.setForeground(new java.awt.Color(255, 255, 255));
        asterisco7.setText("*");
        jPanel3.add(asterisco7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 10, 20));

        asterisco8.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco8.setForeground(new java.awt.Color(255, 255, 255));
        asterisco8.setText("*");
        jPanel3.add(asterisco8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 10, 20));

        asterisco9.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco9.setForeground(new java.awt.Color(255, 255, 255));
        asterisco9.setText("*");
        jPanel3.add(asterisco9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 10, 30));

        asterisco10.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco10.setForeground(new java.awt.Color(255, 255, 255));
        asterisco10.setText("*");
        jPanel3.add(asterisco10, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 199, 10, 30));

        asterisco11.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco11.setForeground(new java.awt.Color(255, 255, 255));
        asterisco11.setText("*");
        jPanel3.add(asterisco11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, -1, 20));

        asterisco12.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco12.setForeground(new java.awt.Color(255, 255, 255));
        asterisco12.setText("*");
        jPanel3.add(asterisco12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        asterisco13.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco13.setForeground(new java.awt.Color(255, 255, 255));
        asterisco13.setText("*");
        jPanel3.add(asterisco13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        asterisco15.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco15.setForeground(new java.awt.Color(255, 255, 255));
        asterisco15.setText("*");
        jPanel3.add(asterisco15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        asterisco16.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        asterisco16.setForeground(new java.awt.Color(255, 255, 255));
        asterisco16.setText("*");
        jPanel3.add(asterisco16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        jLabel19.setToolTipText("Adicionar mais números de Telefone");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 150, -1, 30));

        jLabel21.setToolTipText("Adicionar E-mail");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 30, 30));

        javax.swing.GroupLayout jPanelConteudoLayout = new javax.swing.GroupLayout(jPanelConteudo);
        jPanelConteudo.setLayout(jPanelConteudoLayout);
        jPanelConteudoLayout.setHorizontalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConteudoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelConteudoLayout.setVerticalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConteudoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        asteriscoInfo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        asteriscoInfo.setForeground(new java.awt.Color(255, 51, 51));
        asteriscoInfo.setText("Os campos com asterisco (*) são obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(asteriscoInfo)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(asteriscoInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        txtUserApelido.requestFocus();
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserApelidoActionPerformed
        txtUserOtherName.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserApelidoActionPerformed

    private void txtUserBilheteIdentidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserBilheteIdentidadeFocusGained
        txtUserBilheteIdentidade.setText(txtUserBilheteIdentidade.getText().trim());
    }//GEN-LAST:event_txtUserBilheteIdentidadeFocusGained

    private void txtUserBilheteIdentidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserBilheteIdentidadeFocusLost
        txtUserBilheteIdentidade.setText(txtUserBilheteIdentidade.getText().trim());

        if (txtUserBilheteIdentidade.getText().endsWith(" ")
                && !(txtUserBilheteIdentidade.getText().startsWith(" "))) {

            JOptionPane.showMessageDialog(this,
                    "O Número do Bilhete de Identidade é inválido.",
                    SystemMessage.SYSTEM_NAME, JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtUserBilheteIdentidadeFocusLost

    private void txtUserBilheteIdentidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserBilheteIdentidadeActionPerformed
        txtUserNUIT.requestFocus();
    }//GEN-LAST:event_txtUserBilheteIdentidadeActionPerformed

    private void txtUserNUITFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNUITFocusGained
        txtUserNUIT.setText(txtUserNUIT.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNUITFocusGained

    private void txtUserNUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNUITActionPerformed
        txtUserTelefone.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNUITActionPerformed

    private void txtUserTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserTelefoneActionPerformed
        txtUserEmail.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserTelefoneActionPerformed

    private void txtUserEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserEmailFocusLost
        if (!txtUserEmail.getText().trim().isEmpty()) {
            if (!Expressoes.validarEmail(txtUserEmail.getText())) {
                JOptionPane.showMessageDialog(this,
                        "Endereço Electrónico inválido",
                        SystemMessage.SYSTEM_NAME, JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtUserEmailFocusLost

    private void txtUserEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserEmailKeyPressed

    }//GEN-LAST:event_txtUserEmailKeyPressed

    private void txtUserEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserEmailKeyReleased

    }//GEN-LAST:event_txtUserEmailKeyReleased

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        txtNumeroResidencia.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        txtBairro.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void jComboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDepartamentoActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if (txtUserTelefone.getText().trim().equals("+ (258)")) {
        } else {
            txtUserTelefone.setText(null);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if (txtUserEmail.getText().isEmpty()) {
        } else {

            txtUserEmail.setText(null);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            CadastroFuncionarios dialog = new CadastroFuncionarios(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asterisco1;
    private javax.swing.JLabel asterisco10;
    private javax.swing.JLabel asterisco11;
    private javax.swing.JLabel asterisco12;
    private javax.swing.JLabel asterisco13;
    private javax.swing.JLabel asterisco15;
    private javax.swing.JLabel asterisco16;
    private javax.swing.JLabel asterisco2;
    private javax.swing.JLabel asterisco3;
    private javax.swing.JLabel asterisco5;
    private javax.swing.JLabel asterisco6;
    private javax.swing.JLabel asterisco7;
    private javax.swing.JLabel asterisco8;
    private javax.swing.JLabel asterisco9;
    private javax.swing.JLabel asteriscoInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jChooserDataNascimento;
    private javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JComboBox jComboBoxDepartamento;
    private javax.swing.JComboBox jComboBoxPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JRadioButton jRadioFeminino;
    private javax.swing.JRadioButton jRadioMasculino;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtNumeroResidencia;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtUserApelido;
    private javax.swing.JFormattedTextField txtUserBilheteIdentidade;
    private javax.swing.JTextField txtUserEmail;
    private javax.swing.JFormattedTextField txtUserNUIT;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserOtherName;
    private javax.swing.JFormattedTextField txtUserTelefone;
    // End of variables declaration//GEN-END:variables

    private void configuracoes() {
        setLocationRelativeTo(this);
        this.setIconImage(new ImageIcon(getClass().getResource(SystemMessage.IMAGE_URL)).getImage());
        this.setTitle(SystemMessage.SYSTEM_NAME + " - Funcionários da empresa");
    }
}
