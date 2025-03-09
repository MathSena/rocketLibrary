package com.mathsena;

import java.time.LocalDateTime;

public class Emprestimo {
  private Livro livro;
  private String nomeCliente;
  private LocalDateTime dataEmprestimo;

  public Emprestimo(Livro livro, String nomeCliente, LocalDateTime dataEmprestimo) {
    this.livro = livro;
    this.nomeCliente = nomeCliente;
    this.dataEmprestimo = dataEmprestimo;
  }

  public Livro getLivro() {
    return livro;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public LocalDateTime getDataEmprestimo() {
    return dataEmprestimo;
  }

  @Override
  public String toString() {
    return "Emprestimo [Livro: "
        + livro.getTitulo()
        + ", Cliente: "
        + nomeCliente
        + ", Data: "
        + dataEmprestimo
        + "]";
  }
}
