package main.listener.domain.variable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import main.listener.domain.Clazz;

@Getter
@Setter
public class LocalVariable extends Variable {

  @Builder
  public LocalVariable(final String name, final String type, final int line, final boolean isUsed, final Clazz clazz) {
    super(name, type, line, isUsed, clazz);
  }
}
