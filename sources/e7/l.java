package e7;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RingtoneManager f10670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f10671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Configuration f10672c;

    static final class a extends ae.s implements zd.a<String[]> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            String[] locales = l.this.f10671b.getLocales();
            ae.r.e(locales, "assetManager.locales");
            return locales;
        }
    }

    static final class b extends ae.s implements zd.a<String> {
        b() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String country = l.this.f10672c.locale.getCountry();
            ae.r.e(country, "configuration.locale.country");
            return country;
        }
    }

    static final class c extends ae.s implements zd.a<String> {
        c() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String string = l.this.f10670a.getRingtoneUri(0).toString();
            ae.r.e(string, "ringtoneManager.getRingtoneUri(0).toString()");
            return string;
        }
    }

    static final class d extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f10676a = new d();

        d() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String displayName = TimeZone.getDefault().getDisplayName();
            ae.r.e(displayName, "getDefault().displayName");
            return displayName;
        }
    }

    public l(RingtoneManager ringtoneManager, AssetManager assetManager, Configuration configuration) {
        ae.r.f(ringtoneManager, "ringtoneManager");
        ae.r.f(assetManager, "assetManager");
        ae.r.f(configuration, "configuration");
        this.f10670a = ringtoneManager;
        this.f10671b = assetManager;
        this.f10672c = configuration;
    }

    @Override // e7.k
    public String a() {
        return (String) g7.a.a(d.f10676a, "");
    }

    @Override // e7.k
    public String b() {
        return (String) g7.a.a(new c(), "");
    }

    @Override // e7.k
    public String[] c() {
        return (String[]) g7.a.a(new a(), new String[0]);
    }

    @Override // e7.k
    public String d() {
        String language = Locale.getDefault().getLanguage();
        ae.r.e(language, "getDefault().language");
        return language;
    }

    @Override // e7.k
    public String e() {
        return (String) g7.a.a(new b(), "");
    }
}
