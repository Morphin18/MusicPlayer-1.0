
package model;

import javax.swing.DefaultListModel;


public class ModelPlayList {
    
    private final DefaultListModel<MusicForPlay> listModel;
    
    public ModelPlayList() {
      this.listModel = new DefaultListModel<>();
    }
    public void addElement(MusicForPlay music) {
        listModel.addElement(music);
        
    }

    public DefaultListModel<MusicForPlay> getListModel() {
        return listModel;
    }

}
