package br.com.classroom.services.validation;

public interface Rule<T> {

  String getLogCode();

  default boolean aceita(T t) {
    return true;
  }

  void valida(T t);

}
