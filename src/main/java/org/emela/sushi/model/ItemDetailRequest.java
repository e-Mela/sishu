package org.emela.sushi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ItemDetailRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-12T21:47:58.540008-04:00[America/New_York]")

public class ItemDetailRequest   {
  @JsonProperty("item-id")
  private String itemId = null;

  @JsonProperty("items")
  private List<Item> items = new ArrayList<>();

  public ItemDetailRequest itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "")


  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemDetailRequest items(List<Item> items) {
    this.items = items;
    return this;
  }

  public ItemDetailRequest addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetailRequest itemDetailRequest = (ItemDetailRequest) o;
    return Objects.equals(this.itemId, itemDetailRequest.itemId) &&
        Objects.equals(this.items, itemDetailRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailRequest {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

