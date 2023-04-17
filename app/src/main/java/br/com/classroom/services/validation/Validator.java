package br.com.classroom.services.validation;

import java.util.List;


public interface Validator<R extends Rule<T>, T> {
  String getLogCode();

  List<R> getRules();

  default void valida(T t) {
    // todo -> add log: info(getLogCode(), message: "inicia validacao", payload: null);
    getRules().stream().filter(rule -> rule.aceita(t)).forEach(rule -> rule.valida(t));

  }
}
