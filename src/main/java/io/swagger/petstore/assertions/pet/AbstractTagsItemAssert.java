package io.swagger.petstore.assertions.pet;

import io.swagger.petstore.models.pet.TagsItem;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link TagsItem} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractTagsItemAssert<S extends AbstractTagsItemAssert<S, A>, A extends TagsItem> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractTagsItemAssert}</code> to make assertions on actual TagsItem.
   * @param actual the TagsItem we want to make assertions on.
   */
  protected AbstractTagsItemAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual TagsItem's id is equal to the given one.
   * @param id the given id to compare the actual TagsItem's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual TagsItem's id is not equal to the given one.
   */
  public S hasId(int id) {
    // check that actual TagsItem we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualId = actual.getId();
    if (actualId != id) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual TagsItem's name is equal to the given one.
   * @param name the given name to compare the actual TagsItem's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual TagsItem's name is not equal to the given one.
   */
  public S hasName(String name) {
    // check that actual TagsItem we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualName = actual.getName();
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
