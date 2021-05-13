package view;

import controller.Controller;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JTextField;
import model.ModelPlayList;
import model.MusicForPlay;

public class MainFrame extends JFrame {

    private final Controller controller;
    private static final ModelPlayList model = new ModelPlayList();

    public MainFrame() {
        this.controller = new Controller(this);
        setVisible(true);
        initComponents();

    }

    public static void updateDisplay(String text) {

    }

    public static void updatePlaylist(MusicForPlay music) {
        model.addElement(music);

    }

    public static ModelPlayList getModel() {
        return model;
    }

    public static JList<MusicForPlay> getjPlayList() {
        return jPlayList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserOpen = new javax.swing.JFileChooser();
        mainPanel = new javax.swing.JPanel();
        playlistPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPlayList = new javax.swing.JList<>();
        btnLeft = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        jSlider = new javax.swing.JSlider();
        jToggleButton = new javax.swing.JToggleButton();
        fieldVol = new javax.swing.JTextField();
        findPanel = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        fieldDisplay = new javax.swing.JTextField();
        btnFind1 = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        itemOpen = new javax.swing.JMenuItem();
        itemSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemExit = new javax.swing.JMenuItem();
        mEdit = new javax.swing.JMenu();
        itemAppearance = new javax.swing.JMenuItem();
        mInfo = new javax.swing.JMenu();
        jMenuItem = new javax.swing.JMenuItem();

        jFileChooserOpen.setAcceptAllFileFilterUsed(false);
        jFileChooserOpen.setCurrentDirectory(new java.io.File("C:\\"));
            jFileChooserOpen.setDialogTitle("Open playlist");
            jFileChooserOpen.setMultiSelectionEnabled(true);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Music Player");
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            setResizable(false);

            mainPanel.setBackground(new java.awt.Color(51, 51, 51));
            mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            playlistPanel.setBackground(new java.awt.Color(51, 51, 51));
            playlistPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
            btnAdd.setToolTipText("Add music to playlist");
            btnAdd.setContentAreaFilled(false);
            btnAdd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAddActionPerformed(evt);
                }
            });

            btnDel.setBackground(new java.awt.Color(51, 51, 51));
            btnDel.setForeground(new java.awt.Color(51, 51, 51));
            btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
            btnDel.setToolTipText("Delete music for playlist");
            btnDel.setContentAreaFilled(false);
            btnDel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnDelActionPerformed(evt);
                }
            });

            btnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/up.png"))); // NOI18N
            btnUp.setToolTipText("Up to playlist");
            btnUp.setContentAreaFilled(false);
            btnUp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnUpActionPerformed(evt);
                }
            });

            btnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/down.png"))); // NOI18N
            btnDown.setToolTipText("Down to playlist");
            btnDown.setContentAreaFilled(false);
            btnDown.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnDownActionPerformed(evt);
                }
            });

            jScrollPane.setBorder(null);
            jScrollPane.setForeground(new java.awt.Color(51, 51, 51));

            jPlayList.setBackground(new java.awt.Color(51, 51, 51));
            jPlayList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 71, 71)), "Playlist", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(71, 71, 71))); // NOI18N
            jPlayList.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
            jPlayList.setForeground(new java.awt.Color(102, 255, 255));
            jPlayList.setModel(model.getListModel());
            jPlayList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jPlayList.setToolTipText("Music playlist");
            jPlayList.setSelectionBackground(new java.awt.Color(63, 62, 62));
            jPlayList.setSelectionForeground(new java.awt.Color(102, 255, 255));
            jPlayList.setVerifyInputWhenFocusTarget(false);
            jPlayList.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jPlayListMouseClicked(evt);
                }
            });
            jScrollPane.setViewportView(jPlayList);

            btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/left.png"))); // NOI18N
            btnLeft.setToolTipText("Return song");
            btnLeft.setBorder(null);
            btnLeft.setBorderPainted(false);
            btnLeft.setContentAreaFilled(false);
            btnLeft.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnLeftActionPerformed(evt);
                }
            });

            btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/play.png"))); // NOI18N
            btnPlay.setToolTipText("Play song");
            btnPlay.setBorder(null);
            btnPlay.setBorderPainted(false);
            btnPlay.setContentAreaFilled(false);
            btnPlay.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPlayActionPerformed(evt);
                }
            });

            btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
            btnStop.setToolTipText("Stop song");
            btnStop.setBorder(null);
            btnStop.setBorderPainted(false);
            btnStop.setContentAreaFilled(false);
            btnStop.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnStopActionPerformed(evt);
                }
            });

            btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pause.png"))); // NOI18N
            btnPause.setToolTipText("Pause song");
            btnPause.setBorder(null);
            btnPause.setBorderPainted(false);
            btnPause.setContentAreaFilled(false);
            btnPause.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPauseActionPerformed(evt);
                }
            });

            btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/right.png"))); // NOI18N
            btnRight.setToolTipText("Next song");
            btnRight.setBorder(null);
            btnRight.setBorderPainted(false);
            btnRight.setContentAreaFilled(false);
            btnRight.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRightActionPerformed(evt);
                }
            });

            jSlider.setBackground(new java.awt.Color(51, 51, 51));
            jSlider.setMajorTickSpacing(30);
            jSlider.setMinorTickSpacing(10);
            jSlider.setPaintTicks(true);
            jSlider.setAutoscrolls(true);
            jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    jSliderStateChanged(evt);
                }
            });

            jToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/volume.png"))); // NOI18N
            jToggleButton.setToolTipText("Turn off sound");
            jToggleButton.setBorder(null);
            jToggleButton.setContentAreaFilled(false);
            jToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mute.png"))); // NOI18N
            jToggleButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jToggleButtonActionPerformed(evt);
                }
            });

            fieldVol.setEditable(false);
            fieldVol.setBackground(new java.awt.Color(51, 51, 51));
            fieldVol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            fieldVol.setForeground(new java.awt.Color(102, 255, 255));
            fieldVol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            fieldVol.setText("50");
            fieldVol.setBorder(null);
            fieldVol.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fieldVolActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout playlistPanelLayout = new javax.swing.GroupLayout(playlistPanel);
            playlistPanel.setLayout(playlistPanelLayout);
            playlistPanelLayout.setHorizontalGroup(
                playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playlistPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane)
                        .addGroup(playlistPanelLayout.createSequentialGroup()
                            .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                            .addComponent(jToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldVol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8))
                        .addGroup(playlistPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            playlistPanelLayout.setVerticalGroup(
                playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playlistPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd)
                        .addComponent(btnDown)
                        .addComponent(btnUp)
                        .addComponent(btnDel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldVol))
                    .addContainerGap(14, Short.MAX_VALUE))
            );

            findPanel.setBackground(new java.awt.Color(51, 51, 51));
            findPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(182, 178, 178))); // NOI18N
            findPanel.setForeground(new java.awt.Color(204, 204, 204));

            jTextFieldSearch.setBackground(new java.awt.Color(53, 53, 53));
            jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
            jTextFieldSearch.setForeground(new java.awt.Color(102, 255, 255));
            jTextFieldSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            jTextFieldSearch.setToolTipText("You can write the name of music");
            jTextFieldSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jTextFieldSearch.setCaretColor(new java.awt.Color(102, 255, 255));
            jTextFieldSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            jTextFieldSearch.setDisabledTextColor(new java.awt.Color(51, 51, 51));
            jTextFieldSearch.setSelectionColor(new java.awt.Color(153, 153, 153));

            fieldDisplay.setEditable(false);
            fieldDisplay.setBackground(new java.awt.Color(51, 51, 51));
            fieldDisplay.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
            fieldDisplay.setForeground(new java.awt.Color(153, 255, 255));
            fieldDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            fieldDisplay.setToolTipText("Display");
            fieldDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            btnFind1.setBackground(new java.awt.Color(69, 73, 74));
            btnFind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
            btnFind1.setToolTipText("Find music in playlist");
            btnFind1.setBorder(null);
            btnFind1.setContentAreaFilled(false);
            btnFind1.setIconTextGap(10);
            btnFind1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnFind1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout findPanelLayout = new javax.swing.GroupLayout(findPanel);
            findPanel.setLayout(findPanelLayout);
            findPanelLayout.setHorizontalGroup(
                findPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(findPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fieldDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jTextFieldSearch)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnFind1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            findPanelLayout.setVerticalGroup(
                findPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(findPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(findPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldDisplay)
                        .addComponent(jTextFieldSearch)
                        .addComponent(btnFind1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );

            javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(findPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playlistPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(findPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(playlistPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            jMenuBar.setBackground(new java.awt.Color(51, 51, 51));
            jMenuBar.setBorder(null);
            jMenuBar.setForeground(new java.awt.Color(51, 51, 51));

            mFile.setText("File");

            itemOpen.setText("Open playlist");
            itemOpen.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemOpenActionPerformed(evt);
                }
            });
            mFile.add(itemOpen);

            itemSave.setText("Save playlist");
            itemSave.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemSaveActionPerformed(evt);
                }
            });
            mFile.add(itemSave);
            mFile.add(jSeparator1);

            itemExit.setText("Exit");
            itemExit.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemExitActionPerformed(evt);
                }
            });
            mFile.add(itemExit);

            jMenuBar.add(mFile);

            mEdit.setText("Edit");

            itemAppearance.setText("Appearance");
            mEdit.add(itemAppearance);

            jMenuBar.add(mEdit);

            mInfo.setText("Info");

            jMenuItem.setText("About");
            jMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItemActionPerformed(evt);
                }
            });
            mInfo.add(jMenuItem);

            jMenuBar.add(mInfo);

            setJMenuBar(jMenuBar);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void itemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenActionPerformed

    }//GEN-LAST:event_itemOpenActionPerformed

    private void itemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveActionPerformed

    }//GEN-LAST:event_itemSaveActionPerformed

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed

    }//GEN-LAST:event_itemExitActionPerformed

    private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActionPerformed

    }//GEN-LAST:event_jMenuItemActionPerformed

    public static JTextField getjTextFieldSearch() {
        return jTextFieldSearch;
    }

    public static void setFieldDisplay(String song) {
        fieldDisplay.setText(song);
    }
    private void btnFind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind1ActionPerformed
        controller.find();
    }//GEN-LAST:event_btnFind1ActionPerformed

    private void jToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonActionPerformed
        controller.mute();
    }//GEN-LAST:event_jToggleButtonActionPerformed

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged
        controller.volume();
    }//GEN-LAST:event_jSliderStateChanged

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        controller.next();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        controller.pause();
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        controller.stop();
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        controller.play();
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        controller.back();
    }//GEN-LAST:event_btnLeftActionPerformed

    private void jPlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPlayListMouseClicked

        controller.play();
    }//GEN-LAST:event_jPlayListMouseClicked

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        controller.down();
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        controller.up();
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        controller.del();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        controller.add();
    }//GEN-LAST:event_btnAddActionPerformed

    private void fieldVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldVolActionPerformed
        controller.volume();
    }//GEN-LAST:event_fieldVolActionPerformed


    public static JTextField getFieldVol() {
        return fieldVol;
    }



    /**
     */
    public static JSlider getjSlider() {
        return jSlider;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnFind1;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnUp;
    private static javax.swing.JTextField fieldDisplay;
    private static javax.swing.JTextField fieldVol;
    private javax.swing.JPanel findPanel;
    private javax.swing.JMenuItem itemAppearance;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JFileChooser jFileChooserOpen;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem;
    private static javax.swing.JList<MusicForPlay> jPlayList;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private static javax.swing.JSlider jSlider;
    private static javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JToggleButton jToggleButton;
    private javax.swing.JMenu mEdit;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenu mInfo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel playlistPanel;
    // End of variables declaration//GEN-END:variables

}
