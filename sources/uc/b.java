package uc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import rc.h;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f21756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    final h.b f21758c;

    class a implements h.b {
        a() {
        }

        @Override // rc.h.b
        public String a(String str, String str2) {
            Context contextCreateConfigurationContext = b.this.f21757b;
            if (str2 != null) {
                Locale localeB = b.b(str2);
                Configuration configuration = new Configuration(b.this.f21757b.getResources().getConfiguration());
                configuration.setLocale(localeB);
                contextCreateConfigurationContext = b.this.f21757b.createConfigurationContext(configuration);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", b.this.f21757b.getPackageName());
            if (identifier != 0) {
                return contextCreateConfigurationContext.getResources().getString(identifier);
            }
            return null;
        }
    }

    public b(Context context, h hVar) {
        a aVar = new a();
        this.f21758c = aVar;
        this.f21757b = context;
        this.f21756a = hVar;
        hVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split("-", -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i10 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i10 = 2;
        }
        if (strArrSplit.length > i10 && strArrSplit[i10].length() >= 2 && strArrSplit[i10].length() <= 3) {
            str4 = strArrSplit[i10];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f21757b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                Locale locale = locales.get(i10);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale localeLookup = Locale.lookup(arrayList, list);
            if (localeLookup != null) {
                return localeLookup;
            }
        } else {
            LocaleList locales2 = this.f21757b.getResources().getConfiguration().getLocales();
            for (int i11 = 0; i11 < locales2.size(); i11++) {
                Locale locale2 = locales2.get(i11);
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                for (Locale locale5 : list) {
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(locales.get(i10));
        }
        this.f21756a.b(arrayList);
    }
}
