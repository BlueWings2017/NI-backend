package com.lsitc.domain.common.code.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import lombok.Builder;
import lombok.Getter;

@Getter
public class GroupCodeRemoveResponseVO {

  private final String result;

  @Builder
  private GroupCodeRemoveResponseVO(String result) {
    this.result = result;
  }

  public static GroupCodeRemoveResponseVO of(int deleteRows) {
    String result = 0 < deleteRows ? "success" : "no data";
    return builder().result(result).build();
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }
}
