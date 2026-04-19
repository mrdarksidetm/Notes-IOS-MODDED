package c4;

import androidx.datastore.preferences.protobuf.w;
import c4.g;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w<h, a> implements e4.e {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile e4.f<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends w.a<h, a> implements e4.e {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(boolean z10) {
            t();
            ((h) this.f3751b).c0(z10);
            return this;
        }

        public a B(double d10) {
            t();
            ((h) this.f3751b).d0(d10);
            return this;
        }

        public a C(float f10) {
            t();
            ((h) this.f3751b).e0(f10);
            return this;
        }

        public a D(int i10) {
            t();
            ((h) this.f3751b).f0(i10);
            return this;
        }

        public a E(long j10) {
            t();
            ((h) this.f3751b).g0(j10);
            return this;
        }

        public a F(String str) {
            t();
            ((h) this.f3751b).h0(str);
            return this;
        }

        public a G(g.a aVar) {
            t();
            ((h) this.f3751b).i0(aVar);
            return this;
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6398a;

        b(int i10) {
            this.f6398a = i10;
        }

        public static b a(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        w.I(h.class, hVar);
    }

    private h() {
    }

    public static h T() {
        return DEFAULT_INSTANCE;
    }

    public static a b0() {
        return DEFAULT_INSTANCE.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(g.a aVar) {
        this.value_ = aVar.build();
        this.valueCase_ = 6;
    }

    public boolean S() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double U() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float V() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int W() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long X() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String Y() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g Z() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.O();
    }

    public b a0() {
        return b.a(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object v(w.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f6387a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return w.F(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                e4.f<h> bVar = PARSER;
                if (bVar == null) {
                    synchronized (h.class) {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new w.b<>(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
