package com.dad.serviciorest;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.dad.serviciorest.Usuario.SitterResultado;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Anuncio {
	
	interface AnuncioResultado {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// Atributos del anuncio
	
	@ManyToOne
	private Usuario usuario;
	//private String nombre;
	@JsonView(AnuncioResultado.class)
	private String asunto;
	@JsonView(AnuncioResultado.class)
	private String cuerpo;
	@JsonView(AnuncioResultado.class)
	private String fecha; // DD-MM-YY
	@JsonView(AnuncioResultado.class)
	private String loginUsuario;
	
	
	 
	public Anuncio() {}

	public Anuncio(Usuario user,String asunto, String cuerpo, String fecha) {
		this.setUsuario(user);
		this.setAsunto(asunto);
		this.setCuerpo(cuerpo);
		this.setFecha(fecha);
		this.setLoginUsuario(user.getLogin());
		
	}

	public Anuncio(String asunto, String cuerpo, String fecha) {
		this.setUsuario(null);
		this.setAsunto(asunto);
		this.setCuerpo(asunto);
		this.setFecha(fecha);
		
	}
	

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String login_usuario) {
		this.loginUsuario = login_usuario;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	@Override
	public String toString() {
		return "Anuncio: [Padre="+this.usuario.getNombre()+",Asunto="+this.asunto+",Cuerpo="+this.cuerpo+",Fecha="+this.fecha+"]";
	}
	
}