package com.amazon.c.a.a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7643a = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", e.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7644b = String.format("A valid instance of %s is required to have a certificate ID.", e.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7648f;

    public static String a() {
        return f7643a;
    }

    public static String b() {
        return f7644b;
    }

    public e a(String str) {
        this.f7645c = str;
        return this;
    }

    public void b(String str) {
        this.f7645c = str;
    }

    public e c(String str) {
        this.f7646d = str;
        return this;
    }

    public boolean c() {
        return (StringUtils.isBlank(e()) || StringUtils.isBlank(f())) ? false : true;
    }

    public void d(String str) {
        this.f7646d = str;
    }

    public boolean d() {
        return !StringUtils.isBlank(e());
    }

    public e e(String str) {
        this.f7647e = str;
        return this;
    }

    public String e() {
        return StringUtils.isBlank(this.f7647e) ? this.f7645c : this.f7647e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new EqualsBuilder().append(this.f7647e, eVar.f7647e).append(this.f7648f, eVar.f7648f).append(this.f7645c, eVar.f7645c).append(this.f7646d, eVar.f7646d).isEquals();
    }

    public String f() {
        return StringUtils.isBlank(this.f7648f) ? this.f7646d : this.f7648f;
    }

    public void f(String str) {
        this.f7647e = str;
    }

    public e g(String str) {
        this.f7648f = str;
        return this;
    }

    public String g() {
        return this.f7645c;
    }

    public String h() {
        return this.f7646d;
    }

    public void h(String str) {
        this.f7648f = str;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f7647e).append(this.f7648f).append(this.f7645c).append(this.f7646d).toHashCode();
    }

    public String i() {
        return this.f7647e;
    }

    public String j() {
        return this.f7648f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
