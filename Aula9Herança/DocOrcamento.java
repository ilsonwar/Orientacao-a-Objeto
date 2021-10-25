package net.Unibave.Aula9Herança;

import javax.swing.*;
import java.time.LocalDateTime;

public class DocOrcamento extends Documento{

    private LocalDateTime dataValidate;

    public DocOrcamento() {
    }

    public DocOrcamento(LocalDateTime dataValidate) {
        this.dataValidate = dataValidate;
    }

    public LocalDateTime getDataValidate() {
        return dataValidate;
    }

    public void setDataValidate(LocalDateTime dataValidate) {
        this.dataValidate = dataValidate;
    }

    void emitir(){
        if(LocalDateTime.now().isBefore(getDataValidate())) {
            super.emitir();
        }else{
            JOptionPane.showMessageDialog(null, "Inválido, data atrasada");
        }
    }
}
