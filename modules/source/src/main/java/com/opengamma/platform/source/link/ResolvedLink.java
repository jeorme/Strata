/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.platform.source.link;

import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.ImmutableConstructor;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.collect.ArgChecker;
import com.opengamma.platform.source.id.IdentifiableBean;

/**
 * A link where the link target is directly embedded inside. This
 * type of link is especially useful for testing (as it means
 * sources do not have to be set up with data). However, there are
 * uses outside the testing scope too.
 * <p>
 * Creation should generally be via {@link Link#resolved(IdentifiableBean)}
 * and usage via the {@link Link} interface.
 *
 * @param <T> the type of the link target
 */
@BeanDefinition(builderScope = "private")
public final class ResolvedLink<T extends IdentifiableBean>
    implements Link<T>, ImmutableBean, Serializable {

  /** Serialization version. */
  private static final long serialVersionUID = 1L;

  /**
   * The embedded link target.
   */
  @PropertyDefinition(validate = "notNull")
  private final T linkable;

  //-------------------------------------------------------------------------
  /**
   * Creates the link. Not intended to be called directly,
   * use {@link Link#resolved(IdentifiableBean)} instead.
   *
   * @param linkable  the link target
   */
  @ImmutableConstructor
  ResolvedLink(T linkable) {
    this.linkable = ArgChecker.notNull(linkable, "linkable");
  }

  //-------------------------------------------------------------------------
  /**
   * Resolve the link, returning the embedded object.
   *
   * @param linkResolver  the resolver, not used in this implementation
   * @return the link target
   */
  @Override
  public T resolve(LinkResolver linkResolver) {
    return linkable;
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code ResolvedLink}.
   * @return the meta-bean, not null
   */
  @SuppressWarnings("rawtypes")
  public static ResolvedLink.Meta meta() {
    return ResolvedLink.Meta.INSTANCE;
  }

  /**
   * The meta-bean for {@code ResolvedLink}.
   * @param <R>  the bean's generic type
   * @param cls  the bean's generic type
   * @return the meta-bean, not null
   */
  @SuppressWarnings("unchecked")
  public static <R extends IdentifiableBean> ResolvedLink.Meta<R> metaResolvedLink(Class<R> cls) {
    return ResolvedLink.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(ResolvedLink.Meta.INSTANCE);
  }

  @SuppressWarnings("unchecked")
  @Override
  public ResolvedLink.Meta<T> metaBean() {
    return ResolvedLink.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the embedded link target.
   * @return the value of the property, not null
   */
  public T getLinkable() {
    return linkable;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      ResolvedLink<?> other = (ResolvedLink<?>) obj;
      return JodaBeanUtils.equal(getLinkable(), other.getLinkable());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash += hash * 31 + JodaBeanUtils.hashCode(getLinkable());
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(64);
    buf.append("ResolvedLink{");
    buf.append("linkable").append('=').append(JodaBeanUtils.toString(getLinkable()));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ResolvedLink}.
   * @param <T>  the type
   */
  public static final class Meta<T extends IdentifiableBean> extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    @SuppressWarnings("rawtypes")
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code linkable} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<T> linkable = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
        this, "linkable", ResolvedLink.class, Object.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "linkable");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 1194571860:  // linkable
          return linkable;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends ResolvedLink<T>> builder() {
      return new ResolvedLink.Builder<T>();
    }

    @SuppressWarnings({"unchecked", "rawtypes" })
    @Override
    public Class<? extends ResolvedLink<T>> beanType() {
      return (Class) ResolvedLink.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code linkable} property.
     * @return the meta-property, not null
     */
    public MetaProperty<T> linkable() {
      return linkable;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 1194571860:  // linkable
          return ((ResolvedLink<?>) bean).getLinkable();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code ResolvedLink}.
   * @param <T>  the type
   */
  private static final class Builder<T extends IdentifiableBean> extends DirectFieldsBeanBuilder<ResolvedLink<T>> {

    private T linkable;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 1194571860:  // linkable
          return linkable;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Builder<T> set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 1194571860:  // linkable
          this.linkable = (T) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder<T> set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder<T> setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder<T> setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder<T> setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public ResolvedLink<T> build() {
      return new ResolvedLink<T>(
          linkable);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(64);
      buf.append("ResolvedLink.Builder{");
      buf.append("linkable").append('=').append(JodaBeanUtils.toString(linkable));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
