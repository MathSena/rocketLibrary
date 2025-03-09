package com.mathsena;

import java.time.LocalDateTime;

public class Livro {
  private int id;
  private String titulo;
  private Autor autor;
  private boolean disponivel;
  private LocalDateTime dataCadastro;
  private LocalDateTime dataAtualizacao;

  public Livro(
      int id,
      String titulo,
      Autor autor,
      boolean disponivel,
      LocalDateTime dataCadastro,
      LocalDateTime dataAtualizacao) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = disponivel;
    this.dataCadastro = dataCadastro;
    this.dataAtualizacao = dataAtualizacao;
  }

  // Getters e setters
  public int getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public Autor getAutor() {
    return autor;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public LocalDateTime getDataCadastro() {
    return dataCadastro;
  }

  public LocalDateTime getDataAtualizacao() {
    return dataAtualizacao;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

  public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  @Override
  public String toString() {
    return "ID: " + id + " - " + titulo + " | Autor: " + autor.getNome();
  }
}
