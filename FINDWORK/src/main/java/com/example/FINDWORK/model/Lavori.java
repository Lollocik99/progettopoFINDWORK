package com.example.FINDWORK.model;
import org.json.simple.*;
import java.util.*;

public class Lavori {
 private long id;
 private String ruolo;
 private String azienda;
 private boolean remoto;
 private List<String> linguaggi= new ArrayList<String>();
 private String city;
 private String data;  
 private String orarioLavoro;
 private String sitoWeb;

 public Lavori() {};
 
 public Lavori(long id, String ruolo, String azienda, boolean remoto, JSONArray  linguaggi,String city,String data, String orarioLavoro, String sitoWeb) {
	 setId(id);
	 setRuolo(ruolo);
	 setAzienda(azienda);
	 setRemoto(remoto);
	 setLinguaggi(linguaggi);
	 setCity(city);
	 setData(data);
	 setOrarioLavoro(orarioLavoro);
	 setSitoWeb(sitoWeb);
 }

 public void setData(String data) {
	 this.data=data;
 }

 public String getData() {
	 return data;
 }
 
 public void setLinguaggi(JSONArray array1) {
	
	 for(int i=0; i < array1.size(); i++) {
         linguaggi.add((String)array1.get(i));
      }
	
 }
 
 public List<String> getLinguaggi () {
	 return linguaggi;
 }
 public void setCity(String city) {
	 this.city=city;
 }
 public String getCity() {
	 return city;
 }
 public void setId(long id) {
	 this.id=id;
 }
 public long getId() {
	 return id;
 }
 public void setRuolo(String ruolo) {
	 this.ruolo=ruolo;
 }
 public String getRuolo() {
	 return ruolo;
 }

 public void setAzienda(String azienda) {
	 this.azienda=azienda;
 }
 
 public String getAzienda() {
	 return azienda;
 }
 
 public void setRemoto(boolean remoto) {
	 this.remoto=remoto;
 }

 public boolean getRemoto() {
	 return remoto;
 }

 public void setOrarioLavoro(String orarioLavoro) {
	 this.orarioLavoro=orarioLavoro;
 }

 public String getOrarioLavoro() {
	 return orarioLavoro;
 }
 
 public void setSitoWeb(String sitoWeb) {
	 this.sitoWeb=sitoWeb;
 }

 public String getSitoWeb() {
	 return sitoWeb;
 }

}
