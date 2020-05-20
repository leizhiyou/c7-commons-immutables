package io.holunda.commons.immutables;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.holunda.commons.immutables.CamundaImmutables.ImmutablesConfiguration.CamundaPojoStyle;
import org.camunda.bpm.engine.runtime.Execution;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

@Value.Immutable
@CamundaPojoStyle
@JsonDeserialize(as = ImmutableExecution.class)
@JsonSerialize(as = ImmutableExecution.class)
interface _Execution extends Execution {

  @Nullable
  @Override
  String getTenantId();

  @Override
  default boolean isSuspended() {
    return false;
  }

  @Override
  default boolean isEnded() {
    return false;
  }
}
