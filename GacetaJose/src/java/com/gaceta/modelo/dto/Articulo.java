/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dto;

import java.io.Serializable;

public class Articulo implements Serializable {
    
      private Borrador idArticulo;
      private String status;
      private int valor;
      private Categoria idCategoria;
      private Gaceta idGaceta;
      private Plantilla idPlantilla;

        public Borrador getIdArticulo() {
            return idArticulo;
        }

        public void setIdArticulo(Borrador idArticulo) {
            this.idArticulo = idArticulo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public Categoria getIdCategoria() {
            return idCategoria;
        }

        public void setIdCategoria(Categoria idCategoria) {
            this.idCategoria = idCategoria;
        }

        public Gaceta getIdGaceta() {
            return idGaceta;
        }

        public void setIdGaceta(Gaceta idGaceta) {
            this.idGaceta = idGaceta;
        }

        public Plantilla getIdPlantilla() {
            return idPlantilla;
        }

        public void setIdPlantilla(Plantilla idPlantilla) {
            this.idPlantilla = idPlantilla;
        }
      
      
}
