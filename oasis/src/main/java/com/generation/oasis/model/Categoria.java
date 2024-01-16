package com.generation.oasis.model;

	import java.time.LocalDateTime;

	import org.hibernate.annotations.UpdateTimestamp;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import jakarta.validation.constraints.NotBlank;
	import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_categorias")
	public class Categoria {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "O atributo tipo é Obrigatório!")
	    @Size(min = 5, max = 1000, message = "O atributo tipo deve conter no mínimo 05 e no máximo 1000 caracteres")
	    private String tipo;

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		}

		@UpdateTimestamp
	    private LocalDateTime data;
	}



