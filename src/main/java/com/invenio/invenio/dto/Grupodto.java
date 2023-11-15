package com.invenio.invenio.dto;

public class Grupodto {
        private int grupo_id;
        private String grupo;

        public Grupodto() {
        }

        public Grupodto(int grupo_id, String grupo) {
            this.grupo_id = grupo_id;
            this.grupo = grupo;
        }

        public int getGrupo_id() {
            return grupo_id;
        }

        public void setGrupo_id(int grupo_id) {
            this.grupo_id = grupo_id;
        }

        public String getGrupo() {
            return grupo;
        }

        public void setGrupo(String grupo) {
            this.grupo = grupo;
        }
    }
