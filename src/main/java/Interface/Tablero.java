
package Interface;

import Classes.Monopoly;
import Classes.Player;
import Classes.Casilla;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author L&J
 */

public class Tablero extends javax.swing.JFrame {

    private Welcome myWelcome = new Welcome();
    private Monopoly myGame;
    private int nTurno;
    private JLabel ficha = new JLabel();
    private JPanel origen = new JPanel();
    private JPanel destino = new JPanel();
    private Propiedad tarjeta;
    private Casilla propiedad;
    private Player elTurno;
    
    /**
     * Creates new form NewJFrame
     */
    public Tablero() {
        initComponents();
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        myGame = new Monopoly();
        myGame.inicializarTablero(myWelcome.numPlayers);
        myGame.inicializarCartas();
        setVisible(true); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Board = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        Start = new javax.swing.JPanel();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        P8 = new javax.swing.JLabel();
        P7 = new javax.swing.JLabel();
        P6 = new javax.swing.JLabel();
        P5 = new javax.swing.JLabel();
        TitleStart = new javax.swing.JLabel();
        Brown1 = new javax.swing.JPanel();
        OwnerB1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CChest1 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Brown2 = new javax.swing.JPanel();
        OwnerB2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        IncomeTax = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        Station1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        SkyBlue1 = new javax.swing.JPanel();
        OwnerSK1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ChanceSlot1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        SkyBlue2 = new javax.swing.JPanel();
        OwnerSK2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SkyBlue3 = new javax.swing.JPanel();
        OwnerSK3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Jail = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Purple1 = new javax.swing.JPanel();
        OwnerP1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ElectricService = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Purple2 = new javax.swing.JPanel();
        OwnerP2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Purple3 = new javax.swing.JPanel();
        OwnerP3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Station2 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Orange1 = new javax.swing.JPanel();
        OwnerO1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CChest2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Orange2 = new javax.swing.JPanel();
        OwnerO2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Orange3 = new javax.swing.JPanel();
        OwnerO3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ParkingLot = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Red1 = new javax.swing.JPanel();
        OwnerR1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ChanceSlot2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Red2 = new javax.swing.JPanel();
        OwnerR2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Red3 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Station3 = new javax.swing.JPanel();
        OwnerY3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Yellow1 = new javax.swing.JPanel();
        OwnerY1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Yellow2 = new javax.swing.JPanel();
        OwnerY2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        WaterService = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        Yellow3 = new javax.swing.JPanel();
        OwnerR3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        GotoJail = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        Green1 = new javax.swing.JPanel();
        OwnerG1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Green2 = new javax.swing.JPanel();
        OwnerG2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        CChest3 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Green3 = new javax.swing.JPanel();
        OwnerG3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Station4 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        ChanceSlot3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Blue1 = new javax.swing.JPanel();
        OwnerBL1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        SuperTax = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Blue2 = new javax.swing.JPanel();
        OwnerBL2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        P1name = new javax.swing.JLabel();
        P2name = new javax.swing.JLabel();
        P3name = new javax.swing.JLabel();
        P4name = new javax.swing.JLabel();
        P1money = new javax.swing.JLabel();
        P2money = new javax.swing.JLabel();
        P3money = new javax.swing.JLabel();
        P4money = new javax.swing.JLabel();
        P8name = new javax.swing.JLabel();
        P7name = new javax.swing.JLabel();
        P6name = new javax.swing.JLabel();
        P5name = new javax.swing.JLabel();
        P5money = new javax.swing.JLabel();
        P6money = new javax.swing.JLabel();
        P7money = new javax.swing.JLabel();
        P8money = new javax.swing.JLabel();
        Dice = new javax.swing.JPanel();
        RollDice = new javax.swing.JButton();
        Dice1 = new javax.swing.JLabel();
        Dice2 = new javax.swing.JLabel();
        DiceIcon = new javax.swing.JLabel();
        FinalDice = new javax.swing.JLabel();
        CChestPanel = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        CSlotPanel = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historial = new javax.swing.JTextArea();
        HistorialTitle = new javax.swing.JLabel();
        P5name1 = new javax.swing.JLabel();
        P5name2 = new javax.swing.JLabel();
        TurnTitle = new javax.swing.JLabel();
        Turn = new javax.swing.JLabel();
        P7Icon = new javax.swing.JLabel();
        EndTurn = new javax.swing.JButton();
        btnVerPropiedad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Board.setBackground(new java.awt.Color(28, 186, 95));
        Board.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleText.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        TitleText.setText("MONOPOLY");
        Board.add(TitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, -1));

        Start.setBackground(new java.awt.Color(153, 153, 153));
        Start.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Start.setPreferredSize(new java.awt.Dimension(125, 125));

        P1.setBackground(new java.awt.Color(255, 255, 255));
        P1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P1.setText("♣");
        P1.setToolTipText("");
        P1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P1.setOpaque(true);

        P2.setBackground(new java.awt.Color(255, 255, 255));
        P2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P2.setText("♥");
        P2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P2.setOpaque(true);

        P3.setBackground(new java.awt.Color(255, 255, 255));
        P3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P3.setText("♦");
        P3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P3.setOpaque(true);

        P4.setBackground(new java.awt.Color(255, 255, 255));
        P4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P4.setText("♠");
        P4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P4.setOpaque(true);

        P8.setBackground(new java.awt.Color(255, 255, 255));
        P8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P8.setText("$");
        P8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P8.setOpaque(true);

        P7.setBackground(new java.awt.Color(255, 255, 255));
        P7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P7.setText("₿");
        P7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P7.setOpaque(true);

        P6.setBackground(new java.awt.Color(255, 255, 255));
        P6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P6.setText("&");
        P6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P6.setOpaque(true);

        P5.setBackground(new java.awt.Color(255, 255, 255));
        P5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P5.setText("@");
        P5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P5.setOpaque(true);

        TitleStart.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        TitleStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout StartLayout = new javax.swing.GroupLayout(Start);
        Start.setLayout(StartLayout);
        StartLayout.setHorizontalGroup(
            StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartLayout.createSequentialGroup()
                .addGroup(StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StartLayout.createSequentialGroup()
                        .addComponent(TitleStart)
                        .addGap(18, 18, 18)
                        .addGroup(StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2)
                                .addComponent(P3))
                            .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StartLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(P5)
                        .addGap(7, 7, 7)
                        .addComponent(P6)
                        .addGap(8, 8, 8)
                        .addComponent(P7)
                        .addGap(12, 12, 12)
                        .addComponent(P8)
                        .addGap(18, 18, 18)
                        .addComponent(P4)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        StartLayout.setVerticalGroup(
            StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartLayout.createSequentialGroup()
                .addGroup(StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleStart)
                    .addGroup(StartLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2)
                        .addGap(5, 5, 5)
                        .addComponent(P3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P5)
                    .addComponent(P6)
                    .addComponent(P7)
                    .addComponent(P8)
                    .addComponent(P4))
                .addContainerGap())
        );

        Board.add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 851, -1, -1));
        Start.getAccessibleContext().setAccessibleName("");
        Start.getAccessibleContext().setAccessibleDescription("");

        Brown1.setBackground(new java.awt.Color(255, 255, 255));
        Brown1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Brown1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerB1.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout OwnerB1Layout = new javax.swing.GroupLayout(OwnerB1);
        OwnerB1.setLayout(OwnerB1Layout);
        OwnerB1Layout.setHorizontalGroup(
            OwnerB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerB1Layout.setVerticalGroup(
            OwnerB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel1.setText("Mediterranean");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel4.setText("Avenue");

        javax.swing.GroupLayout Brown1Layout = new javax.swing.GroupLayout(Brown1);
        Brown1.setLayout(Brown1Layout);
        Brown1Layout.setHorizontalGroup(
            Brown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Brown1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1))
            .addGroup(Brown1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4))
        );
        Brown1Layout.setVerticalGroup(
            Brown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Brown1Layout.createSequentialGroup()
                .addComponent(OwnerB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel4))
        );

        Board.add(Brown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1011, 851, 110, -1));

        CChest1.setBackground(new java.awt.Color(255, 255, 255));
        CChest1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CChest1.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel36.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel36.setText("Community Chest");

        javax.swing.GroupLayout CChest1Layout = new javax.swing.GroupLayout(CChest1);
        CChest1.setLayout(CChest1Layout);
        CChest1Layout.setHorizontalGroup(
            CChest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CChest1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel36))
            .addGroup(CChest1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel37))
        );
        CChest1Layout.setVerticalGroup(
            CChest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CChest1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel36)
                .addGap(36, 36, 36)
                .addComponent(jLabel37))
        );

        Board.add(CChest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 851, 110, -1));

        Brown2.setBackground(new java.awt.Color(255, 255, 255));
        Brown2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Brown2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerB2.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout OwnerB2Layout = new javax.swing.GroupLayout(OwnerB2);
        OwnerB2.setLayout(OwnerB2Layout);
        OwnerB2Layout.setHorizontalGroup(
            OwnerB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerB2Layout.setVerticalGroup(
            OwnerB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel2.setText("Baltic Avenue");

        javax.swing.GroupLayout Brown2Layout = new javax.swing.GroupLayout(Brown2);
        Brown2.setLayout(Brown2Layout);
        Brown2Layout.setHorizontalGroup(
            Brown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Brown2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2))
        );
        Brown2Layout.setVerticalGroup(
            Brown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Brown2Layout.createSequentialGroup()
                .addComponent(OwnerB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2))
        );

        Board.add(Brown2, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 851, 110, -1));

        IncomeTax.setBackground(new java.awt.Color(255, 255, 255));
        IncomeTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IncomeTax.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel52.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel52.setText("Income Tax");

        javax.swing.GroupLayout IncomeTaxLayout = new javax.swing.GroupLayout(IncomeTax);
        IncomeTax.setLayout(IncomeTaxLayout);
        IncomeTaxLayout.setHorizontalGroup(
            IncomeTaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeTaxLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel52))
            .addGroup(IncomeTaxLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel51))
        );
        IncomeTaxLayout.setVerticalGroup(
            IncomeTaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeTaxLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel52)
                .addGap(26, 26, 26)
                .addComponent(jLabel51))
        );

        Board.add(IncomeTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 851, 110, -1));

        Station1.setBackground(new java.awt.Color(255, 255, 255));
        Station1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Station1.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel42.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel42.setText("Reading Railroad");

        javax.swing.GroupLayout Station1Layout = new javax.swing.GroupLayout(Station1);
        Station1.setLayout(Station1Layout);
        Station1Layout.setHorizontalGroup(
            Station1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Station1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel35)))
        );
        Station1Layout.setVerticalGroup(
            Station1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel42)
                .addGap(32, 32, 32)
                .addComponent(jLabel35))
        );

        Board.add(Station1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 851, 110, -1));

        SkyBlue1.setBackground(new java.awt.Color(255, 255, 255));
        SkyBlue1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SkyBlue1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerSK1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout OwnerSK1Layout = new javax.swing.GroupLayout(OwnerSK1);
        OwnerSK1.setLayout(OwnerSK1Layout);
        OwnerSK1Layout.setHorizontalGroup(
            OwnerSK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerSK1Layout.setVerticalGroup(
            OwnerSK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel3.setText("Oriental Avenue");

        javax.swing.GroupLayout SkyBlue1Layout = new javax.swing.GroupLayout(SkyBlue1);
        SkyBlue1.setLayout(SkyBlue1Layout);
        SkyBlue1Layout.setHorizontalGroup(
            SkyBlue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerSK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(SkyBlue1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3))
        );
        SkyBlue1Layout.setVerticalGroup(
            SkyBlue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkyBlue1Layout.createSequentialGroup()
                .addComponent(OwnerSK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3))
        );

        Board.add(SkyBlue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 851, 110, -1));

        ChanceSlot1.setBackground(new java.awt.Color(204, 153, 255));
        ChanceSlot1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChanceSlot1.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel29.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel29.setText("Chance Slot!");

        javax.swing.GroupLayout ChanceSlot1Layout = new javax.swing.GroupLayout(ChanceSlot1);
        ChanceSlot1.setLayout(ChanceSlot1Layout);
        ChanceSlot1Layout.setHorizontalGroup(
            ChanceSlot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanceSlot1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel30))
            .addGroup(ChanceSlot1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel29))
        );
        ChanceSlot1Layout.setVerticalGroup(
            ChanceSlot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanceSlot1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel30)
                .addGap(10, 10, 10)
                .addComponent(jLabel29))
        );

        Board.add(ChanceSlot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 851, 110, -1));

        SkyBlue2.setBackground(new java.awt.Color(255, 255, 255));
        SkyBlue2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SkyBlue2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerSK2.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout OwnerSK2Layout = new javax.swing.GroupLayout(OwnerSK2);
        OwnerSK2.setLayout(OwnerSK2Layout);
        OwnerSK2Layout.setHorizontalGroup(
            OwnerSK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerSK2Layout.setVerticalGroup(
            OwnerSK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setText("Vermont Avenue");

        javax.swing.GroupLayout SkyBlue2Layout = new javax.swing.GroupLayout(SkyBlue2);
        SkyBlue2.setLayout(SkyBlue2Layout);
        SkyBlue2Layout.setHorizontalGroup(
            SkyBlue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerSK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(SkyBlue2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5))
        );
        SkyBlue2Layout.setVerticalGroup(
            SkyBlue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkyBlue2Layout.createSequentialGroup()
                .addComponent(OwnerSK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5))
        );

        Board.add(SkyBlue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 851, 110, -1));

        SkyBlue3.setBackground(new java.awt.Color(255, 255, 255));
        SkyBlue3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SkyBlue3.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerSK3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout OwnerSK3Layout = new javax.swing.GroupLayout(OwnerSK3);
        OwnerSK3.setLayout(OwnerSK3Layout);
        OwnerSK3Layout.setHorizontalGroup(
            OwnerSK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerSK3Layout.setVerticalGroup(
            OwnerSK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel6.setText("Connecticut Avenue");

        javax.swing.GroupLayout SkyBlue3Layout = new javax.swing.GroupLayout(SkyBlue3);
        SkyBlue3.setLayout(SkyBlue3Layout);
        SkyBlue3Layout.setHorizontalGroup(
            SkyBlue3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerSK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(SkyBlue3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6))
        );
        SkyBlue3Layout.setVerticalGroup(
            SkyBlue3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkyBlue3Layout.createSequentialGroup()
                .addComponent(OwnerSK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6))
        );

        Board.add(SkyBlue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 851, 110, -1));

        Jail.setBackground(new java.awt.Color(255, 102, 102));
        Jail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jail.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel57.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel57.setText("For a walk!");

        javax.swing.GroupLayout JailLayout = new javax.swing.GroupLayout(Jail);
        Jail.setLayout(JailLayout);
        JailLayout.setHorizontalGroup(
            JailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JailLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel26))
            .addComponent(jLabel57)
        );
        JailLayout.setVerticalGroup(
            JailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JailLayout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(28, 28, 28)
                .addComponent(jLabel57))
        );

        Board.add(Jail, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 851, -1, -1));

        Purple1.setBackground(new java.awt.Color(255, 255, 255));
        Purple1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Purple1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerP1.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout OwnerP1Layout = new javax.swing.GroupLayout(OwnerP1);
        OwnerP1.setLayout(OwnerP1Layout);
        OwnerP1Layout.setHorizontalGroup(
            OwnerP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerP1Layout.setVerticalGroup(
            OwnerP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel7.setText("St Charles Place");

        javax.swing.GroupLayout Purple1Layout = new javax.swing.GroupLayout(Purple1);
        Purple1.setLayout(Purple1Layout);
        Purple1Layout.setHorizontalGroup(
            Purple1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Purple1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(OwnerP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Purple1Layout.setVerticalGroup(
            Purple1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Purple1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7))
            .addComponent(OwnerP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Board.add(Purple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 771, -1, 80));

        ElectricService.setBackground(new java.awt.Color(255, 255, 255));
        ElectricService.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ElectricService.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel54.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel54.setText("Electric Company");

        javax.swing.GroupLayout ElectricServiceLayout = new javax.swing.GroupLayout(ElectricService);
        ElectricService.setLayout(ElectricServiceLayout);
        ElectricServiceLayout.setHorizontalGroup(
            ElectricServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectricServiceLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel54))
            .addGroup(ElectricServiceLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel53))
        );
        ElectricServiceLayout.setVerticalGroup(
            ElectricServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectricServiceLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel54)
                .addGap(1, 1, 1)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(ElectricService, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 691, -1, 80));

        Purple2.setBackground(new java.awt.Color(255, 255, 255));
        Purple2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Purple2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerP2.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout OwnerP2Layout = new javax.swing.GroupLayout(OwnerP2);
        OwnerP2.setLayout(OwnerP2Layout);
        OwnerP2Layout.setHorizontalGroup(
            OwnerP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerP2Layout.setVerticalGroup(
            OwnerP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel8.setText("States Avenue");

        javax.swing.GroupLayout Purple2Layout = new javax.swing.GroupLayout(Purple2);
        Purple2.setLayout(Purple2Layout);
        Purple2Layout.setHorizontalGroup(
            Purple2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Purple2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(OwnerP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Purple2Layout.setVerticalGroup(
            Purple2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Purple2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8))
            .addComponent(OwnerP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Board.add(Purple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 611, -1, 80));

        Purple3.setBackground(new java.awt.Color(255, 255, 255));
        Purple3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Purple3.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerP3.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout OwnerP3Layout = new javax.swing.GroupLayout(OwnerP3);
        OwnerP3.setLayout(OwnerP3Layout);
        OwnerP3Layout.setHorizontalGroup(
            OwnerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerP3Layout.setVerticalGroup(
            OwnerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel9.setText("Virginia Avenue");

        javax.swing.GroupLayout Purple3Layout = new javax.swing.GroupLayout(Purple3);
        Purple3.setLayout(Purple3Layout);
        Purple3Layout.setHorizontalGroup(
            Purple3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Purple3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(OwnerP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Purple3Layout.setVerticalGroup(
            Purple3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Purple3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9))
            .addComponent(OwnerP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Board.add(Purple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 531, -1, 80));

        Station2.setBackground(new java.awt.Color(255, 255, 255));
        Station2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Station2.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel46.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel46.setText("Pennsylvania Railroad");

        javax.swing.GroupLayout Station2Layout = new javax.swing.GroupLayout(Station2);
        Station2.setLayout(Station2Layout);
        Station2Layout.setHorizontalGroup(
            Station2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel46))
            .addComponent(jLabel45)
        );
        Station2Layout.setVerticalGroup(
            Station2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel46)
                .addGap(6, 6, 6)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Station2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 451, -1, 80));

        Orange1.setBackground(new java.awt.Color(255, 255, 255));
        Orange1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Orange1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerO1.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout OwnerO1Layout = new javax.swing.GroupLayout(OwnerO1);
        OwnerO1.setLayout(OwnerO1Layout);
        OwnerO1Layout.setHorizontalGroup(
            OwnerO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerO1Layout.setVerticalGroup(
            OwnerO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel10.setText("St James Place");

        javax.swing.GroupLayout Orange1Layout = new javax.swing.GroupLayout(Orange1);
        Orange1.setLayout(Orange1Layout);
        Orange1Layout.setHorizontalGroup(
            Orange1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orange1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(OwnerO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Orange1Layout.setVerticalGroup(
            Orange1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orange1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10))
            .addComponent(OwnerO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Board.add(Orange1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 371, -1, 80));

        CChest2.setBackground(new java.awt.Color(255, 255, 255));
        CChest2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CChest2.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel39.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel39.setText("Community Chest");

        javax.swing.GroupLayout CChest2Layout = new javax.swing.GroupLayout(CChest2);
        CChest2.setLayout(CChest2Layout);
        CChest2Layout.setHorizontalGroup(
            CChest2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CChest2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel39))
            .addGroup(CChest2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel38))
        );
        CChest2Layout.setVerticalGroup(
            CChest2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CChest2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel39)
                .addGap(6, 6, 6)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(CChest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 291, -1, 80));

        Orange2.setBackground(new java.awt.Color(255, 255, 255));
        Orange2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Orange2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerO2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout OwnerO2Layout = new javax.swing.GroupLayout(OwnerO2);
        OwnerO2.setLayout(OwnerO2Layout);
        OwnerO2Layout.setHorizontalGroup(
            OwnerO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerO2Layout.setVerticalGroup(
            OwnerO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel11.setText("Tennessee Avenue");

        javax.swing.GroupLayout Orange2Layout = new javax.swing.GroupLayout(Orange2);
        Orange2.setLayout(Orange2Layout);
        Orange2Layout.setHorizontalGroup(
            Orange2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orange2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(OwnerO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Orange2Layout.setVerticalGroup(
            Orange2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orange2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11))
            .addComponent(OwnerO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Board.add(Orange2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 211, -1, 80));

        Orange3.setBackground(new java.awt.Color(255, 255, 255));
        Orange3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Orange3.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerO3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout OwnerO3Layout = new javax.swing.GroupLayout(OwnerO3);
        OwnerO3.setLayout(OwnerO3Layout);
        OwnerO3Layout.setHorizontalGroup(
            OwnerO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerO3Layout.setVerticalGroup(
            OwnerO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel12.setText("New York Avenue");

        javax.swing.GroupLayout Orange3Layout = new javax.swing.GroupLayout(Orange3);
        Orange3.setLayout(Orange3Layout);
        Orange3Layout.setHorizontalGroup(
            Orange3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orange3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(OwnerO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Orange3Layout.setVerticalGroup(
            Orange3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orange3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel12))
            .addComponent(OwnerO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Board.add(Orange3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, -1, 80));

        ParkingLot.setBackground(new java.awt.Color(255, 204, 153));
        ParkingLot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ParkingLot.setPreferredSize(new java.awt.Dimension(125, 125));

        javax.swing.GroupLayout ParkingLotLayout = new javax.swing.GroupLayout(ParkingLot);
        ParkingLot.setLayout(ParkingLotLayout);
        ParkingLotLayout.setHorizontalGroup(
            ParkingLotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingLotLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel27))
        );
        ParkingLotLayout.setVerticalGroup(
            ParkingLotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingLotLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel27))
        );

        Board.add(ParkingLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        Red1.setBackground(new java.awt.Color(255, 255, 255));
        Red1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Red1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerR1.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout OwnerR1Layout = new javax.swing.GroupLayout(OwnerR1);
        OwnerR1.setLayout(OwnerR1Layout);
        OwnerR1Layout.setHorizontalGroup(
            OwnerR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerR1Layout.setVerticalGroup(
            OwnerR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel13.setText("Kentucky Avenue");

        javax.swing.GroupLayout Red1Layout = new javax.swing.GroupLayout(Red1);
        Red1.setLayout(Red1Layout);
        Red1Layout.setHorizontalGroup(
            Red1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Red1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13))
            .addComponent(OwnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Red1Layout.setVerticalGroup(
            Red1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Red1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(OwnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Red1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 6, 110, -1));

        ChanceSlot2.setBackground(new java.awt.Color(204, 153, 255));
        ChanceSlot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChanceSlot2.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel32.setText("Chance Slot!");

        javax.swing.GroupLayout ChanceSlot2Layout = new javax.swing.GroupLayout(ChanceSlot2);
        ChanceSlot2.setLayout(ChanceSlot2Layout);
        ChanceSlot2Layout.setHorizontalGroup(
            ChanceSlot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanceSlot2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel31))
            .addGroup(ChanceSlot2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel32))
        );
        ChanceSlot2Layout.setVerticalGroup(
            ChanceSlot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanceSlot2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel31)
                .addGap(10, 10, 10)
                .addComponent(jLabel32))
        );

        Board.add(ChanceSlot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 6, 110, -1));

        Red2.setBackground(new java.awt.Color(255, 255, 255));
        Red2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Red2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerR2.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout OwnerR2Layout = new javax.swing.GroupLayout(OwnerR2);
        OwnerR2.setLayout(OwnerR2Layout);
        OwnerR2Layout.setHorizontalGroup(
            OwnerR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerR2Layout.setVerticalGroup(
            OwnerR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel14.setText("Indiana Avenue");

        javax.swing.GroupLayout Red2Layout = new javax.swing.GroupLayout(Red2);
        Red2.setLayout(Red2Layout);
        Red2Layout.setHorizontalGroup(
            Red2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Red2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14))
            .addComponent(OwnerR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Red2Layout.setVerticalGroup(
            Red2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Red2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(OwnerR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Red2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 6, 110, -1));

        Red3.setBackground(new java.awt.Color(255, 255, 255));
        Red3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Red3.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel44.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel44.setText("B&O Railroad");

        javax.swing.GroupLayout Red3Layout = new javax.swing.GroupLayout(Red3);
        Red3.setLayout(Red3Layout);
        Red3Layout.setHorizontalGroup(
            Red3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Red3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel43))
            .addGroup(Red3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel44))
        );
        Red3Layout.setVerticalGroup(
            Red3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Red3Layout.createSequentialGroup()
                .addComponent(jLabel43)
                .addGap(32, 32, 32)
                .addComponent(jLabel44))
        );

        Board.add(Red3, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 6, 110, -1));

        Station3.setBackground(new java.awt.Color(255, 255, 255));
        Station3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Station3.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerY3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout OwnerY3Layout = new javax.swing.GroupLayout(OwnerY3);
        OwnerY3.setLayout(OwnerY3Layout);
        OwnerY3Layout.setHorizontalGroup(
            OwnerY3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerY3Layout.setVerticalGroup(
            OwnerY3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel18.setText("Marvin Avenue");

        javax.swing.GroupLayout Station3Layout = new javax.swing.GroupLayout(Station3);
        Station3.setLayout(Station3Layout);
        Station3Layout.setHorizontalGroup(
            Station3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel18))
            .addComponent(OwnerY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Station3Layout.setVerticalGroup(
            Station3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(OwnerY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Station3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1011, 6, 110, -1));

        Yellow1.setBackground(new java.awt.Color(255, 255, 255));
        Yellow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Yellow1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerY1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout OwnerY1Layout = new javax.swing.GroupLayout(OwnerY1);
        OwnerY1.setLayout(OwnerY1Layout);
        OwnerY1Layout.setHorizontalGroup(
            OwnerY1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerY1Layout.setVerticalGroup(
            OwnerY1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel16.setText("Atlantic Avenue");

        javax.swing.GroupLayout Yellow1Layout = new javax.swing.GroupLayout(Yellow1);
        Yellow1.setLayout(Yellow1Layout);
        Yellow1Layout.setHorizontalGroup(
            Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Yellow1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel16))
            .addComponent(OwnerY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Yellow1Layout.setVerticalGroup(
            Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Yellow1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel16)
                .addGap(6, 6, 6)
                .addComponent(OwnerY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 6, 110, -1));

        Yellow2.setBackground(new java.awt.Color(255, 255, 255));
        Yellow2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Yellow2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerY2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout OwnerY2Layout = new javax.swing.GroupLayout(OwnerY2);
        OwnerY2.setLayout(OwnerY2Layout);
        OwnerY2Layout.setHorizontalGroup(
            OwnerY2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerY2Layout.setVerticalGroup(
            OwnerY2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel17.setText("Ventnor Avenue");

        javax.swing.GroupLayout Yellow2Layout = new javax.swing.GroupLayout(Yellow2);
        Yellow2.setLayout(Yellow2Layout);
        Yellow2Layout.setHorizontalGroup(
            Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Yellow2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17))
            .addComponent(OwnerY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Yellow2Layout.setVerticalGroup(
            Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Yellow2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel17)
                .addGap(6, 6, 6)
                .addComponent(OwnerY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Yellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 6, 110, -1));

        WaterService.setBackground(new java.awt.Color(255, 255, 255));
        WaterService.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        WaterService.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel55.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Water Works");

        javax.swing.GroupLayout WaterServiceLayout = new javax.swing.GroupLayout(WaterService);
        WaterService.setLayout(WaterServiceLayout);
        WaterServiceLayout.setHorizontalGroup(
            WaterServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WaterServiceLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(WaterServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        WaterServiceLayout.setVerticalGroup(
            WaterServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WaterServiceLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel56)
                .addGap(26, 26, 26)
                .addComponent(jLabel55))
        );

        Board.add(WaterService, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 6, 110, -1));

        Yellow3.setBackground(new java.awt.Color(255, 255, 255));
        Yellow3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Yellow3.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerR3.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout OwnerR3Layout = new javax.swing.GroupLayout(OwnerR3);
        OwnerR3.setLayout(OwnerR3Layout);
        OwnerR3Layout.setHorizontalGroup(
            OwnerR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        OwnerR3Layout.setVerticalGroup(
            OwnerR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel15.setText("Illinois Avenue");

        javax.swing.GroupLayout Yellow3Layout = new javax.swing.GroupLayout(Yellow3);
        Yellow3.setLayout(Yellow3Layout);
        Yellow3Layout.setHorizontalGroup(
            Yellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Yellow3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel15))
            .addComponent(OwnerR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Yellow3Layout.setVerticalGroup(
            Yellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Yellow3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(OwnerR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Yellow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 6, 110, -1));

        GotoJail.setBackground(new java.awt.Color(153, 204, 255));
        GotoJail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GotoJail.setAlignmentX(0.0F);
        GotoJail.setAlignmentY(0.0F);
        GotoJail.setPreferredSize(new java.awt.Dimension(125, 125));

        javax.swing.GroupLayout GotoJailLayout = new javax.swing.GroupLayout(GotoJail);
        GotoJail.setLayout(GotoJailLayout);
        GotoJailLayout.setHorizontalGroup(
            GotoJailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        GotoJailLayout.setVerticalGroup(
            GotoJailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GotoJailLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel28))
        );

        Board.add(GotoJail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 6, -1, -1));

        Green1.setBackground(new java.awt.Color(255, 255, 255));
        Green1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Green1.setAlignmentX(0.0F);
        Green1.setAlignmentY(0.0F);
        Green1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerG1.setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout OwnerG1Layout = new javax.swing.GroupLayout(OwnerG1);
        OwnerG1.setLayout(OwnerG1Layout);
        OwnerG1Layout.setHorizontalGroup(
            OwnerG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerG1Layout.setVerticalGroup(
            OwnerG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel19.setText("Pacific Avenue");

        javax.swing.GroupLayout Green1Layout = new javax.swing.GroupLayout(Green1);
        Green1.setLayout(Green1Layout);
        Green1Layout.setHorizontalGroup(
            Green1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Green1Layout.createSequentialGroup()
                .addComponent(OwnerG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel19))
        );
        Green1Layout.setVerticalGroup(
            Green1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Green1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19))
        );

        Board.add(Green1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 131, -1, 80));

        Green2.setBackground(new java.awt.Color(255, 255, 255));
        Green2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Green2.setAlignmentX(0.0F);
        Green2.setAlignmentY(0.0F);
        Green2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerG2.setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout OwnerG2Layout = new javax.swing.GroupLayout(OwnerG2);
        OwnerG2.setLayout(OwnerG2Layout);
        OwnerG2Layout.setHorizontalGroup(
            OwnerG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerG2Layout.setVerticalGroup(
            OwnerG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel20.setText("North Carolina");

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel21.setText("Avenue");

        javax.swing.GroupLayout Green2Layout = new javax.swing.GroupLayout(Green2);
        Green2.setLayout(Green2Layout);
        Green2Layout.setHorizontalGroup(
            Green2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Green2Layout.createSequentialGroup()
                .addComponent(OwnerG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(Green2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)))
        );
        Green2Layout.setVerticalGroup(
            Green2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Green2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel20)
                .addGap(0, 0, 0)
                .addComponent(jLabel21))
        );

        Board.add(Green2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 211, -1, 80));

        CChest3.setBackground(new java.awt.Color(255, 255, 255));
        CChest3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CChest3.setAlignmentX(0.0F);
        CChest3.setAlignmentY(0.0F);
        CChest3.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel41.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel41.setText("Community Chest");

        javax.swing.GroupLayout CChest3Layout = new javax.swing.GroupLayout(CChest3);
        CChest3.setLayout(CChest3Layout);
        CChest3Layout.setHorizontalGroup(
            CChest3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CChest3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel41))
            .addGroup(CChest3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel40))
        );
        CChest3Layout.setVerticalGroup(
            CChest3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CChest3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel41)
                .addGap(6, 6, 6)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(CChest3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 291, -1, 80));

        Green3.setBackground(new java.awt.Color(255, 255, 255));
        Green3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Green3.setAlignmentX(0.0F);
        Green3.setAlignmentY(0.0F);
        Green3.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerG3.setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout OwnerG3Layout = new javax.swing.GroupLayout(OwnerG3);
        OwnerG3.setLayout(OwnerG3Layout);
        OwnerG3Layout.setHorizontalGroup(
            OwnerG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerG3Layout.setVerticalGroup(
            OwnerG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel22.setText("Pennsylvania");

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel23.setText("Avenue");

        javax.swing.GroupLayout Green3Layout = new javax.swing.GroupLayout(Green3);
        Green3.setLayout(Green3Layout);
        Green3Layout.setHorizontalGroup(
            Green3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Green3Layout.createSequentialGroup()
                .addComponent(OwnerG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(Green3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)))
        );
        Green3Layout.setVerticalGroup(
            Green3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Green3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel22)
                .addGap(0, 0, 0)
                .addComponent(jLabel23))
        );

        Board.add(Green3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 371, -1, 80));

        Station4.setBackground(new java.awt.Color(255, 255, 255));
        Station4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Station4.setAlignmentX(0.0F);
        Station4.setAlignmentY(0.0F);
        Station4.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel48.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel48.setText("Short Line");

        javax.swing.GroupLayout Station4Layout = new javax.swing.GroupLayout(Station4);
        Station4.setLayout(Station4Layout);
        Station4Layout.setHorizontalGroup(
            Station4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel48))
            .addGroup(Station4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel47))
        );
        Station4Layout.setVerticalGroup(
            Station4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Station4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel48)
                .addGap(6, 6, 6)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Board.add(Station4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 451, -1, 80));

        ChanceSlot3.setBackground(new java.awt.Color(204, 153, 255));
        ChanceSlot3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChanceSlot3.setAlignmentX(0.0F);
        ChanceSlot3.setAlignmentY(0.0F);
        ChanceSlot3.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel34.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel34.setText("Chance Slot!");

        javax.swing.GroupLayout ChanceSlot3Layout = new javax.swing.GroupLayout(ChanceSlot3);
        ChanceSlot3.setLayout(ChanceSlot3Layout);
        ChanceSlot3Layout.setHorizontalGroup(
            ChanceSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanceSlot3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel33)
                .addGap(6, 6, 6)
                .addComponent(jLabel34))
        );
        ChanceSlot3Layout.setVerticalGroup(
            ChanceSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanceSlot3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(ChanceSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)))
        );

        Board.add(ChanceSlot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 531, -1, 80));

        Blue1.setBackground(new java.awt.Color(255, 255, 255));
        Blue1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Blue1.setAlignmentX(0.0F);
        Blue1.setAlignmentY(0.0F);
        Blue1.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerBL1.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout OwnerBL1Layout = new javax.swing.GroupLayout(OwnerBL1);
        OwnerBL1.setLayout(OwnerBL1Layout);
        OwnerBL1Layout.setHorizontalGroup(
            OwnerBL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerBL1Layout.setVerticalGroup(
            OwnerBL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel25.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel25.setText("Park Place");

        javax.swing.GroupLayout Blue1Layout = new javax.swing.GroupLayout(Blue1);
        Blue1.setLayout(Blue1Layout);
        Blue1Layout.setHorizontalGroup(
            Blue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Blue1Layout.createSequentialGroup()
                .addComponent(OwnerBL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel25))
        );
        Blue1Layout.setVerticalGroup(
            Blue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerBL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Blue1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel25))
        );

        Board.add(Blue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 611, -1, 80));

        SuperTax.setBackground(new java.awt.Color(255, 255, 255));
        SuperTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SuperTax.setAlignmentX(0.0F);
        SuperTax.setAlignmentY(0.0F);
        SuperTax.setPreferredSize(new java.awt.Dimension(125, 125));

        jLabel50.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel50.setText("Luxury Tax");

        javax.swing.GroupLayout SuperTaxLayout = new javax.swing.GroupLayout(SuperTax);
        SuperTax.setLayout(SuperTaxLayout);
        SuperTaxLayout.setHorizontalGroup(
            SuperTaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperTaxLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel49)
                .addGap(6, 6, 6)
                .addComponent(jLabel50))
        );
        SuperTaxLayout.setVerticalGroup(
            SuperTaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperTaxLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(SuperTaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)))
        );

        Board.add(SuperTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 691, -1, 80));

        Blue2.setBackground(new java.awt.Color(255, 255, 255));
        Blue2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Blue2.setAlignmentX(0.0F);
        Blue2.setAlignmentY(0.0F);
        Blue2.setPreferredSize(new java.awt.Dimension(125, 125));

        OwnerBL2.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout OwnerBL2Layout = new javax.swing.GroupLayout(OwnerBL2);
        OwnerBL2.setLayout(OwnerBL2Layout);
        OwnerBL2Layout.setHorizontalGroup(
            OwnerBL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        OwnerBL2Layout.setVerticalGroup(
            OwnerBL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel24.setText("Boardwalk");

        javax.swing.GroupLayout Blue2Layout = new javax.swing.GroupLayout(Blue2);
        Blue2.setLayout(Blue2Layout);
        Blue2Layout.setHorizontalGroup(
            Blue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Blue2Layout.createSequentialGroup()
                .addComponent(OwnerBL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel24))
        );
        Blue2Layout.setVerticalGroup(
            Blue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OwnerBL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Blue2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel24))
        );

        Board.add(Blue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 771, -1, 80));

        P1name.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P1name.setText("♣ P1");
        Board.add(P1name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 690, -1, -1));

        P2name.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P2name.setText("♥ P2");
        Board.add(P2name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 730, 62, -1));

        P3name.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P3name.setText("♦ P3");
        P3name.setPreferredSize(new java.awt.Dimension(80, 21));
        Board.add(P3name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 770, -1, 30));

        P4name.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P4name.setText("♠ P4");
        Board.add(P4name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 810, -1, -1));

        P1money.setBackground(new java.awt.Color(204, 204, 204));
        P1money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P1money.setText("$00000");
        P1money.setOpaque(true);
        Board.add(P1money, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, -1, -1));

        P2money.setBackground(new java.awt.Color(204, 204, 204));
        P2money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P2money.setText("$00000");
        P2money.setOpaque(true);
        Board.add(P2money, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 730, -1, -1));

        P3money.setBackground(new java.awt.Color(204, 204, 204));
        P3money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P3money.setText("$00000");
        P3money.setOpaque(true);
        Board.add(P3money, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 770, -1, -1));

        P4money.setBackground(new java.awt.Color(204, 204, 204));
        P4money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P4money.setText("$00000");
        P4money.setOpaque(true);
        Board.add(P4money, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 810, -1, -1));

        P8name.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P8name.setText("$ P8");
        Board.add(P8name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 808, -1, -1));

        P7name.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P7name.setText("P7");
        Board.add(P7name, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 769, 50, 30));

        P6name.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P6name.setText("& P6");
        Board.add(P6name, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 730, 100, -1));

        P5name.setBackground(new java.awt.Color(255, 255, 255));
        P5name.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P5name.setText("$00000");
        P5name.setOpaque(true);
        Board.add(P5name, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 760, -1, -1));

        P5money.setBackground(new java.awt.Color(204, 204, 204));
        P5money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P5money.setText("$00000");
        P5money.setOpaque(true);
        Board.add(P5money, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, -1, -1));

        P6money.setBackground(new java.awt.Color(204, 204, 204));
        P6money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P6money.setText("$00000");
        P6money.setOpaque(true);
        Board.add(P6money, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 730, -1, -1));

        P7money.setBackground(new java.awt.Color(204, 204, 204));
        P7money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P7money.setText("$00000");
        P7money.setOpaque(true);
        Board.add(P7money, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 770, -1, -1));

        P8money.setBackground(new java.awt.Color(204, 204, 204));
        P8money.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        P8money.setText("$00000");
        P8money.setOpaque(true);
        Board.add(P8money, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 810, -1, -1));

        Dice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Roll the Dice", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18))); // NOI18N
        Dice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RollDice.setText("Im feeling lucky!");
        RollDice.setIconTextGap(2);
        RollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollDiceActionPerformed(evt);
            }
        });
        Dice.add(RollDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 50));

        Dice1.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        Dice1.setText("6");
        Dice.add(Dice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 70));

        Dice2.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        Dice2.setText("6");
        Dice.add(Dice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 30, 70));

        DiceIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Dice.add(DiceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, 70));

        FinalDice.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        FinalDice.setText("12");
        Dice.add(FinalDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, 60));

        Board.add(Dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 611, 183, 222));

        CChestPanel.setBackground(new java.awt.Color(204, 255, 255));
        CChestPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Community Chest", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N
        CChestPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CChestPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Board.add(CChestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 129, 91));

        CSlotPanel.setBackground(new java.awt.Color(204, 255, 255));
        CSlotPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chance Slot", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N
        CSlotPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CSlotPanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Board.add(CSlotPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 129, 91));

        Historial.setEditable(false);
        Historial.setColumns(20);
        Historial.setRows(5);
        jScrollPane1.setViewportView(Historial);

        Board.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 506, 330, 160));

        HistorialTitle.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        HistorialTitle.setText("Historial");
        Board.add(HistorialTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        P5name1.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P5name1.setText("@ P5");
        Board.add(P5name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 691, -1, -1));

        P5name2.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        P5name2.setText("Taxes:");
        Board.add(P5name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 720, -1, -1));

        TurnTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        TurnTitle.setText("Turno de:");
        Board.add(TurnTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 520, -1, -1));

        Turn.setBackground(new java.awt.Color(255, 51, 51));
        Turn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Turn.setText("PP");
        Turn.setOpaque(true);
        Board.add(Turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, -1, -1));

        P7Icon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        P7Icon.setText("₿");
        Board.add(P7Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 762, -1, 40));

        EndTurn.setText("Terminar Turno");
        EndTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTurnActionPerformed(evt);
            }
        });
        Board.add(EndTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 803, -1, 30));

        btnVerPropiedad.setText("Ver Propiedad");
        btnVerPropiedad.setEnabled(false);
        btnVerPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPropiedadActionPerformed(evt);
            }
        });
        Board.add(btnVerPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, 1245, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollDiceActionPerformed
        this.RollDice.setEnabled(false);
        nTurno= myGame.getnTurno();
        this.buscarFicha(nTurno);
        origen = this.buscarCasilla(myGame.miPosicion());
        myGame.tirarDado();
        myGame.setDado(Dice1, Dice2, FinalDice);
        destino = this.buscarCasilla(myGame.calcularYUbicarDestino());
        myGame.moverFicha(origen, destino, ficha);
        this.ubicarFicha(ficha, nTurno);
        destino.setComponentZOrder(ficha, 0);
        repaint();
        this.btnVerPropiedad.setEnabled(true);
    }//GEN-LAST:event_RollDiceActionPerformed

    private void EndTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTurnActionPerformed
        this.btnVerPropiedad.setEnabled(false);
        myGame.nextTurno();
        this.Turn.setText(myGame.miTurno.getName());
        this.Turn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
        this.RollDice.setEnabled(true);
    }//GEN-LAST:event_EndTurnActionPerformed

    private void btnVerPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPropiedadActionPerformed
        tarjeta = new Propiedad();
        tarjeta.setVisible(true);
    }//GEN-LAST:event_btnVerPropiedadActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
    
    
    private void buscarFicha(int n){
        switch(n){
            case 0: this.ficha = P1; break;
            case 1: this.ficha = P2; break;
            case 2: this.ficha = P3; break;
            case 3: this.ficha = P4; break;
            case 4: this.ficha = P5; break;
            case 5: this.ficha = P6; break;
            case 6: this.ficha = P7; break;
            case 7: this.ficha = P8; break;
        }
    }
    
    private JPanel buscarCasilla(int n){
        switch(n){
            case 0: return this.Start;
            case 1: return this.Brown1;
            case 2: return this.CChest1;
            case 3: return this.Brown2;
            case 4: return this.IncomeTax;
            case 5: return this.Station1;
            case 6: return this.SkyBlue1;
            case 7: return this.ChanceSlot1;
            case 8: return this.SkyBlue2;
            case 9: return this.SkyBlue3;
            case 10: return this.Jail;
            case 11: return this.Purple1;
            case 12: return this.ElectricService;
            case 13: return this.Purple2;
            case 14: return this.Purple3;
            case 15: return this.Station2;
            case 16: return this.Orange1;
            case 17: return this.CChest2;
            case 18: return this.Orange2;
            case 19: return this.Orange3;
            case 20: return this.ParkingLot;
            case 21: return this.Red1;
            case 22: return this.ChanceSlot2;
            case 23: return this.Red2;
            case 24: return this.Red3;
            case 25: return this.Station3;
            case 26: return this.Yellow1;
            case 27: return this.Yellow2;
            case 28: return this.WaterService;
            case 29: return this.Yellow3;
            case 30: return this.GotoJail;
            case 31: return this.Green1;
            case 32: return this.Green2;
            case 33: return this.CChest3;
            case 34: return this.Green3;
            case 35: return this.Station4;
            case 36: return this.ChanceSlot3;
            case 37: return this.Blue1;
            case 38: return this.SuperTax;
            case 39: return this.Blue2;
        }
        return null;
    }
    
    public void ubicarFicha(JLabel label,int n){
        switch(n){
            case 0: label.setLocation(20, 20); break;
            case 1: label.setLocation(40, 20); break;
            case 2: label.setLocation(60, 20); break;
            case 3: label.setLocation(80, 20); break;
            case 4: label.setLocation(20, 40); break;
            case 5: label.setLocation(40, 40); break;
            case 6: label.setLocation(60, 40); break;
            case 7: label.setLocation(80, 40); break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Blue1;
    public javax.swing.JPanel Blue2;
    private javax.swing.JPanel Board;
    public javax.swing.JPanel Brown1;
    public javax.swing.JPanel Brown2;
    public javax.swing.JPanel CChest1;
    public javax.swing.JPanel CChest2;
    public javax.swing.JPanel CChest3;
    private javax.swing.JPanel CChestPanel;
    private javax.swing.JPanel CSlotPanel;
    public javax.swing.JPanel ChanceSlot1;
    public javax.swing.JPanel ChanceSlot2;
    public javax.swing.JPanel ChanceSlot3;
    private javax.swing.JPanel Dice;
    private javax.swing.JLabel Dice1;
    private javax.swing.JLabel Dice2;
    private javax.swing.JLabel DiceIcon;
    public javax.swing.JPanel ElectricService;
    private javax.swing.JButton EndTurn;
    private javax.swing.JLabel FinalDice;
    public javax.swing.JPanel GotoJail;
    public javax.swing.JPanel Green1;
    public javax.swing.JPanel Green2;
    public javax.swing.JPanel Green3;
    private javax.swing.JTextArea Historial;
    private javax.swing.JLabel HistorialTitle;
    public javax.swing.JPanel IncomeTax;
    public javax.swing.JPanel Jail;
    public javax.swing.JPanel Orange1;
    public javax.swing.JPanel Orange2;
    public javax.swing.JPanel Orange3;
    public javax.swing.JPanel OwnerB1;
    public javax.swing.JPanel OwnerB2;
    public javax.swing.JPanel OwnerBL1;
    public javax.swing.JPanel OwnerBL2;
    public javax.swing.JPanel OwnerG1;
    public javax.swing.JPanel OwnerG2;
    public javax.swing.JPanel OwnerG3;
    public javax.swing.JPanel OwnerO1;
    public javax.swing.JPanel OwnerO2;
    public javax.swing.JPanel OwnerO3;
    public javax.swing.JPanel OwnerP1;
    public javax.swing.JPanel OwnerP2;
    public javax.swing.JPanel OwnerP3;
    public javax.swing.JPanel OwnerR1;
    public javax.swing.JPanel OwnerR2;
    public javax.swing.JPanel OwnerR3;
    public javax.swing.JPanel OwnerSK1;
    public javax.swing.JPanel OwnerSK2;
    public javax.swing.JPanel OwnerSK3;
    public javax.swing.JPanel OwnerY1;
    public javax.swing.JPanel OwnerY2;
    public javax.swing.JPanel OwnerY3;
    public javax.swing.JLabel P1;
    private javax.swing.JLabel P1money;
    private javax.swing.JLabel P1name;
    public javax.swing.JLabel P2;
    private javax.swing.JLabel P2money;
    private javax.swing.JLabel P2name;
    public javax.swing.JLabel P3;
    private javax.swing.JLabel P3money;
    private javax.swing.JLabel P3name;
    public javax.swing.JLabel P4;
    private javax.swing.JLabel P4money;
    private javax.swing.JLabel P4name;
    public javax.swing.JLabel P5;
    private javax.swing.JLabel P5money;
    private javax.swing.JLabel P5name;
    private javax.swing.JLabel P5name1;
    private javax.swing.JLabel P5name2;
    public javax.swing.JLabel P6;
    private javax.swing.JLabel P6money;
    private javax.swing.JLabel P6name;
    public javax.swing.JLabel P7;
    private javax.swing.JLabel P7Icon;
    private javax.swing.JLabel P7money;
    private javax.swing.JLabel P7name;
    public javax.swing.JLabel P8;
    private javax.swing.JLabel P8money;
    private javax.swing.JLabel P8name;
    public javax.swing.JPanel ParkingLot;
    public javax.swing.JPanel Purple1;
    public javax.swing.JPanel Purple2;
    public javax.swing.JPanel Purple3;
    public javax.swing.JPanel Red1;
    public javax.swing.JPanel Red2;
    public javax.swing.JPanel Red3;
    private javax.swing.JButton RollDice;
    public javax.swing.JPanel SkyBlue1;
    public javax.swing.JPanel SkyBlue2;
    public javax.swing.JPanel SkyBlue3;
    public javax.swing.JPanel Start;
    public javax.swing.JPanel Station1;
    public javax.swing.JPanel Station2;
    public javax.swing.JPanel Station3;
    public javax.swing.JPanel Station4;
    public javax.swing.JPanel SuperTax;
    private javax.swing.JLabel TitleStart;
    private javax.swing.JLabel TitleText;
    private javax.swing.JLabel Turn;
    private javax.swing.JLabel TurnTitle;
    public javax.swing.JPanel WaterService;
    public javax.swing.JPanel Yellow1;
    public javax.swing.JPanel Yellow2;
    public javax.swing.JPanel Yellow3;
    private javax.swing.JButton btnVerPropiedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
