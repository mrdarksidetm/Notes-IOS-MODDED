package rc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f19413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j.c f19414c;

    class a implements j.c {
        a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            Bundle bundle;
            if (s.this.f19413b == null) {
            }
            String str = iVar.f20503a;
            Object obj = iVar.f20504b;
            cc.b.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        b10 = 0;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        b10 = 1;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        b10 = 2;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        b10 = 3;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        b10 = 4;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        b10 = 5;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        b10 = 6;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        b10 = 7;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        b10 = 8;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        b10 = 9;
                    }
                    break;
            }
            try {
                switch (b10) {
                    case 0:
                        JSONObject jSONObject = (JSONObject) obj;
                        s.this.f19413b.c(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.success(null);
                        break;
                    case 1:
                        s.this.f19413b.i(e.a((JSONObject) obj));
                        dVar.success(null);
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            s.this.f19413b.h(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.success(null);
                        } catch (NoSuchFieldException e10) {
                            e = e10;
                            dVar.error("error", e.getMessage(), null);
                            return;
                        }
                        break;
                    case 3:
                        s.this.f19413b.j();
                        dVar.success(null);
                        break;
                    case 4:
                        s.this.f19413b.b();
                        dVar.success(null);
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        s.this.f19413b.a(string, bundle);
                        dVar.success(null);
                        break;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d10 = jSONObject3.getDouble("width");
                        double d11 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i10 = 0; i10 < 16; i10++) {
                            dArr[i10] = jSONArray2.getDouble(i10);
                        }
                        s.this.f19413b.d(d10, d11, dArr);
                        dVar.success(null);
                        break;
                    case 7:
                        s.this.f19413b.f(((Boolean) obj).booleanValue());
                        dVar.success(null);
                        break;
                    case 8:
                        s.this.f19413b.g();
                        dVar.success(null);
                        break;
                    case 9:
                        s.this.f19413b.e();
                        dVar.success(null);
                        break;
                    default:
                        dVar.notImplemented();
                        break;
                }
            } catch (JSONException e11) {
                e = e11;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f19416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f19421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f19422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f19423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f19424i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f19425j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String[] f19426k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b[] f19427l;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f19428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String[] f19429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e f19430c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f19431d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f19428a = str;
                this.f19429b = strArr;
                this.f19431d = str2;
                this.f19430c = eVar;
            }

            public static a a(JSONObject jSONObject) throws JSONException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = b(jSONArray.getString(i10));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String b(java.lang.String r16) {
                /*
                    Method dump skipped, instruction units count: 802
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: rc.s.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f19416a = z10;
            this.f19417b = z11;
            this.f19418c = z12;
            this.f19419d = z13;
            this.f19420e = z14;
            this.f19421f = dVar;
            this.f19422g = cVar;
            this.f19423h = num;
            this.f19424i = str;
            this.f19425j = aVar;
            this.f19426k = strArr;
            this.f19427l = bVarArr;
        }

        public static b a(JSONObject jSONObject) throws JSONException {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i10 = 0; i10 < length; i10++) {
                    bVarArr2[i10] = a(jSONArray.getJSONObject(i10));
                }
                bVarArr = bVarArr2;
            }
            Integer numB = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    arrayList.add(jSONArray2.optString(i11));
                }
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.b(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), numB, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
        }

        private static Integer b(String str) {
            str.hashCode();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f19432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19434c;

        public c(g gVar, boolean z10, boolean z11) {
            this.f19432a = gVar;
            this.f19433b = z10;
            this.f19434c = z11;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.b(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19440a;

        d(String str) {
            this.f19440a = str;
        }

        static d b(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f19440a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19445e;

        public e(String str, int i10, int i11, int i12, int i13) {
            if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
            }
            if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i12) + ", " + String.valueOf(i13) + ")");
            }
            if (i13 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i12));
            }
            if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i10));
            }
            if (i11 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i11));
            }
            this.f19441a = str;
            this.f19442b = i10;
            this.f19443c = i11;
            this.f19444d = i12;
            this.f19445e = i13;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i10 = this.f19444d;
            return i10 >= 0 && this.f19445e > i10;
        }

        public boolean c() {
            return this.f19442b >= 0;
        }
    }

    public interface f {
        void a(String str, Bundle bundle);

        void b();

        void c(int i10, boolean z10);

        void d(double d10, double d11, double[] dArr);

        void e();

        void f(boolean z10);

        void g();

        void h(int i10, b bVar);

        void i(e eVar);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19458a;

        g(String str) {
            this.f19458a = str;
        }

        static g b(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                if (gVar.f19458a.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public s(fc.a aVar) {
        a aVar2 = new a();
        this.f19414c = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/textinput", sc.f.f20502a);
        this.f19412a = jVar;
        jVar.e(aVar2);
    }

    private static HashMap<Object, Object> c(ArrayList<tc.b> arrayList) {
        HashMap<Object, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<tc.b> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        map.put("deltas", jSONArray);
        return map;
    }

    private static HashMap<Object, Object> d(String str, int i10, int i11, int i12, int i13) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i10));
        map.put("selectionExtent", Integer.valueOf(i11));
        map.put("composingBase", Integer.valueOf(i12));
        map.put("composingExtent", Integer.valueOf(i13));
        return map;
    }

    public void b(int i10, Map<String, Object> map) {
        cc.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.commitContent", map));
    }

    public void e(int i10) {
        cc.b.f("TextInputChannel", "Sending 'done' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.done"));
    }

    public void f(int i10) {
        cc.b.f("TextInputChannel", "Sending 'go' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.go"));
    }

    public void g(int i10) {
        cc.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.newline"));
    }

    public void h(int i10) {
        cc.b.f("TextInputChannel", "Sending 'next' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.next"));
    }

    public void i(int i10, String str, Bundle bundle) {
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.f19412a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i10), map));
    }

    public void j(int i10) {
        cc.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.previous"));
    }

    public void k() {
        this.f19412a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i10) {
        cc.b.f("TextInputChannel", "Sending 'search' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.search"));
    }

    public void m(int i10) {
        cc.b.f("TextInputChannel", "Sending 'send' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.send"));
    }

    public void n(f fVar) {
        this.f19413b = fVar;
    }

    public void o(int i10) {
        cc.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f19412a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.unspecified"));
    }

    public void p(int i10, String str, int i11, int i12, int i13, int i14) {
        cc.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i11 + "\nSelection end: " + i12 + "\nComposing start: " + i13 + "\nComposing end: " + i14);
        this.f19412a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i10), d(str, i11, i12, i13, i14)));
    }

    public void q(int i10, ArrayList<tc.b> arrayList) {
        cc.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f19412a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i10), c(arrayList)));
    }

    public void r(int i10, HashMap<String, e> map) {
        cc.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry<String, e> entry : map.entrySet()) {
            e value = entry.getValue();
            map2.put(entry.getKey(), d(value.f19441a, value.f19442b, value.f19443c, -1, -1));
        }
        this.f19412a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i10), map2));
    }
}
