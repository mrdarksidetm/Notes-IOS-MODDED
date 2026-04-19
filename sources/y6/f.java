package y6;

import ae.r;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Iterator;
import java.util.List;
import je.w;
import le.a2;
import le.d1;
import le.n0;
import le.o0;
import md.i0;
import nd.c0;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<String> f23388a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f23389b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a2 f23390c;

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.PickKt$pickDocumentsFromDirectoryUri$1", f = "Pick.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_listDividerAlertDialog, R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "invokeSuspend")
    static final class a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f23396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23397g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<String> f23398h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<String> f23399i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Activity f23400j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m f23401k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f23402l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f23403m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f23404n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f23405o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, List<String> list2, Activity activity, m mVar, String str, String str2, boolean z10, long j10, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f23398h = list;
            this.f23399i = list2;
            this.f23400j = activity;
            this.f23401k = mVar;
            this.f23402l = str;
            this.f23403m = str2;
            this.f23404n = z10;
            this.f23405o = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f23398h, this.f23399i, this.f23400j, this.f23401k, this.f23402l, this.f23403m, this.f23404n, this.f23405o, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:(1:207)|77|209|78|(6:80|211|81|203|82|(1:251)(1:253))(1:250)|91|205|92|93|215|94|(2:254|96)(3:97|256|255)) */
        /* JADX WARN: Can't wrap try/catch for region: R(12:207|77|209|78|(6:80|211|81|203|82|(1:251)(1:253))(1:250)|91|205|92|93|215|94|(2:254|96)(3:97|256|255)) */
        /* JADX WARN: Can't wrap try/catch for region: R(39:(1:227)|50|238|51|201|52|219|53|217|54|(13:213|56|(4:58|59|199|60)|230|68|(2:69|(3:225|71|(2:249|73)(6:74|75|(12:207|77|209|78|(6:80|211|81|203|82|(1:251)(1:253))(1:250)|91|205|92|93|215|94|(2:254|96)(3:97|256|255))(1:252)|106|257|255))(2:248|112))|223|113|(17:118|119|242|120|121|234|122|123|236|124|125|239|126|(1:128)(1:129)|130|(1:132)(1:133)|134)(1:117)|135|232|45|(13:47|(1:49)|227|50|238|51|201|52|219|53|217|54|(0))(5:170|(2:178|179)(1:179)|180|34|(2:36|(1:38)(6:39|40|41|244|42|(4:44|232|45|(0)(0))(5:176|(0)(0)|180|34|(2:197|198)(0))))(0)))|67|230|68|(3:69|(0)(0)|255)|223|113|(1:116)|118|119|242|120|121|234|122|123|236|124|125|239|126|(0)(0)|130|(0)(0)|134|135|232|45|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(43:7|221|8|9|227|50|238|51|201|52|219|53|217|54|(13:213|56|(4:58|59|199|60)|230|68|(2:69|(3:225|71|(2:249|73)(6:74|75|(12:207|77|209|78|(6:80|211|81|203|82|(1:251)(1:253))(1:250)|91|205|92|93|215|94|(2:254|96)(3:97|256|255))(1:252)|106|257|255))(2:248|112))|223|113|(17:118|119|242|120|121|234|122|123|236|124|125|239|126|(1:128)(1:129)|130|(1:132)(1:133)|134)(1:117)|135|232|45|(13:47|(1:49)|227|50|238|51|201|52|219|53|217|54|(0))(5:170|(2:178|179)(1:179)|180|34|(2:36|(1:38)(6:39|40|41|244|42|(4:44|232|45|(0)(0))(5:176|(0)(0)|180|34|(2:197|198)(0))))(0)))|67|230|68|(3:69|(0)(0)|255)|223|113|(1:116)|118|119|242|120|121|234|122|123|236|124|125|239|126|(0)(0)|130|(0)(0)|134|135|232|45|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(4:58|59|199|60) */
        /* JADX WARN: Can't wrap try/catch for region: R(6:39|40|41|244|42|(4:44|232|45|(0)(0))(5:176|(0)(0)|180|34|(2:197|198)(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(6:80|211|81|203|82|(1:251)(1:253)) */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x026a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x026b, code lost:
        
            r21 = r5;
            r5 = r0;
            r2 = 0;
            r3 = r10;
            r0 = r20;
            r10 = r21;
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0276, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x028f, code lost:
        
            r21 = r5;
            r5 = r0;
            r3 = r10;
            r0 = r20;
            r10 = r21;
            r1 = null;
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0299, code lost:
        
            r8 = 3;
            r9 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x02fa, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x02fc, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x02fd, code lost:
        
            r8 = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x02ff, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0300, code lost:
        
            r8 = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0302, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x0309, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x030a, code lost:
        
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x030b, code lost:
        
            r8 = 3;
            r9 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x030d, code lost:
        
            r17 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            r30 = r15;
            r15 = r11;
            r11 = r30;
            r31 = r13;
            r13 = r12;
            r12 = r31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x030f, code lost:
        
            r5 = r0;
            r1 = r3;
            r3 = r10;
            r0 = r20;
            r10 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x0317, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x0319, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x031a, code lost:
        
            r22 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x031c, code lost:
        
            r20 = r3;
            r21 = r5;
            r2 = 0;
            r8 = 3;
            r9 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x0324, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x0325, code lost:
        
            r22 = r2;
            r20 = r3;
            r21 = r5;
            r2 = 0;
            r8 = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:158:0x032d, code lost:
        
            r17 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x0330, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:160:0x0331, code lost:
        
            r22 = r2;
            r20 = r3;
            r21 = r5;
            r17 = r7;
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x033b, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:162:0x033c, code lost:
        
            r22 = r2;
            r20 = r3;
            r21 = r5;
            r17 = r7;
            r2 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:163:0x0345, code lost:
        
            r8 = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x0357, code lost:
        
            r5 = r0;
            r3 = r10;
            r0 = r20;
            r10 = r21;
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:173:0x0380, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x0381, code lost:
        
            r22 = r2;
            r17 = r7;
            r2 = r8;
            r1 = null;
            r8 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:175:0x0388, code lost:
        
            r29 = r5;
            r5 = r0;
            r0 = r3;
            r3 = r10;
            r10 = r29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:181:0x03b5, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x03b6, code lost:
        
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x03b9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x03ba, code lost:
        
            r22 = r2;
            r17 = r7;
            r2 = r8;
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:189:0x03cb, code lost:
        
            r8 = r6;
            r5 = r0;
            r0 = r3;
            r3 = r10;
            r15 = r11;
            r14 = r20;
            r11 = r21;
            r10 = null;
            r29 = r13;
            r13 = r12;
            r12 = r29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:192:0x03f0, code lost:
        
            r10.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:246:0x03ab, code lost:
        
            r5 = r1;
            r0 = r3;
            r6 = r8;
            r3 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01b0, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x01b5, code lost:
        
            r1 = null;
            r2 = 0;
            r8 = 3;
            r9 = 1;
            r17 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x022e, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x022f, code lost:
        
            r3 = r10;
            r1 = null;
            r2 = 0;
            r8 = 3;
            r9 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x023b, code lost:
        
            r17 = 2;
            r10 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x023e, code lost:
        
            r5 = r0;
            r0 = r20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x025f, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0260, code lost:
        
            r2 = 0;
            r1 = null;
            r17 = 2;
            r3 = r10;
            r10 = r21;
            r8 = 3;
            r9 = 1;
         */
        /* JADX WARN: Path cross not found for [B:115:0x02ab, B:118:0x02b4], limit reached: 246 */
        /* JADX WARN: Path cross not found for [B:213:0x019d, B:67:0x01bd], limit reached: 246 */
        /* JADX WARN: Path cross not found for [B:67:0x01bd, B:213:0x019d], limit reached: 246 */
        /* JADX WARN: Removed duplicated region for block: B:128:0x02d0  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02dc  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x02de  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x036a  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0391  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x03a4  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x03a7  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x03f0  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x03f8  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x03fc  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:225:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x029f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0167 A[Catch: all -> 0x037d, Exception -> 0x0380, TRY_LEAVE, TryCatch #12 {all -> 0x037d, blocks: (B:56:0x019d, B:58:0x01a1, B:60:0x01a7, B:45:0x0161, B:47:0x0167, B:81:0x0217, B:82:0x021b), top: B:213:0x019d }] */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x03cb -> B:190:0x03da). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c6 -> B:26:0x00ce). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0179 -> B:227:0x017c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1066
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.PickKt$processPickedDirectory$1", f = "Pick.kt", l = {}, m = "invokeSuspend")
    static final class b extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f23408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f23409d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Intent intent, Activity activity, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f23407b = i10;
            this.f23408c = intent;
            this.f23409d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f23407b, this.f23408c, this.f23409d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                rd.b.e()
                int r0 = r6.f23406a
                if (r0 != 0) goto L88
                md.u.b(r7)
                y6.m r7 = new y6.m
                r7.<init>()
                long r0 = java.lang.System.nanoTime()
                int r2 = r6.f23407b
                r3 = -1
                r4 = 0
                java.lang.String r5 = "PickOrSavePlugin"
                if (r2 != r3) goto L5e
                android.content.Intent r2 = r6.f23408c
                if (r2 == 0) goto L24
                android.net.Uri r2 = r2.getData()
                goto L25
            L24:
                r2 = r4
            L25:
                if (r2 == 0) goto L5e
                android.content.Intent r2 = r6.f23408c
                android.net.Uri r2 = r2.getData()
                ae.r.c(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Picked directory: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                android.util.Log.d(r5, r3)
                android.app.Activity r3 = r6.f23409d
                android.content.ContentResolver r3 = r3.getContentResolver()
                r4 = 3
                r3.takePersistableUriPermission(r2, r4)
                java.lang.String r2 = r2.toString()
                java.util.List r2 = nd.s.d(r2)
                sc.j$d r3 = y6.h.d()
                r7.k(r2, r3)
                goto L6a
            L5e:
                java.lang.String r2 = "Cancelled"
                android.util.Log.d(r5, r2)
                sc.j$d r2 = y6.h.d()
                r7.k(r4, r2)
            L6a:
                long r2 = java.lang.System.nanoTime()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r4 = "Elapsed time in nanoseconds: "
                r7.append(r4)
                long r2 = r2 - r0
                r7.append(r2)
                java.lang.String r7 = r7.toString()
                java.io.PrintStream r0 = java.lang.System.out
                r0.println(r7)
                md.i0 r7 = md.i0.f15558a
                return r7
            L88:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.PickKt$processPickedFiles$1", f = "Pick.kt", l = {382, 441}, m = "invokeSuspend")
    static final class c extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f23412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Intent f23415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f23416g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Intent intent, Activity activity, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f23414e = i10;
            this.f23415f = intent;
            this.f23416g = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new c(this.f23414e, this.f23415f, this.f23416g, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0288  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02ad  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 768
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final a2 c() {
        return f23390c;
    }

    public static final void d(String str, String str2, boolean z10, List<String> list, List<String> list2, Activity activity) {
        r.f(str2, "directoryUri");
        r.f(list, "allowedExtensions");
        r.f(list2, "mimeTypesFilter");
        r.f(activity, "context");
        f23390c = le.k.d(o0.a(d1.b()), null, null, new a(list2, list, activity, new m(), str2, str, z10, System.nanoTime(), null), 3, null);
    }

    public static final void e(List<String> list, List<String> list2, boolean z10, boolean z11, Activity activity) {
        r.f(list, "allowedExtensions");
        r.f(list2, "mimeTypesFilter");
        r.f(activity, "context");
        List<String> listF0 = c0.F0(list2);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) it.next());
            if (mimeTypeFromExtension != null) {
                listF0.add(mimeTypeFromExtension);
            }
        }
        m mVar = new m();
        long jNanoTime = System.nanoTime();
        f23388a = list;
        f23389b = z11;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (z10) {
            intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        }
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.setType("*/*");
        if (!listF0.isEmpty()) {
            mVar.c(listF0, intent);
        }
        activity.startActivityForResult(intent, mVar.q());
        Log.d("PickOrSavePlugin", "pickFile - OUT");
        System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
    }

    public static final void f(String str, Activity activity) {
        r.f(activity, "context");
        m mVar = new m();
        long jNanoTime = System.nanoTime();
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (Build.VERSION.SDK_INT >= 26 && str != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", mVar.s(w.W0(str).toString()));
        }
        activity.startActivityForResult(intent, mVar.r());
        Log.d("PickOrSavePlugin", "pickSingleDirectory - OUT");
        System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
    }

    public static final void g(List<String> list, List<String> list2, boolean z10, boolean z11, Activity activity) {
        r.f(list, "allowedExtensions");
        r.f(list2, "mimeTypesFilter");
        r.f(activity, "context");
        List<String> listF0 = c0.F0(list2);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) it.next());
            if (mimeTypeFromExtension != null) {
                listF0.add(mimeTypeFromExtension);
            }
        }
        m mVar = new m();
        long jNanoTime = System.nanoTime();
        f23388a = list;
        f23389b = z11;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (z10) {
            intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        }
        intent.setType("*/*");
        if (!listF0.isEmpty()) {
            mVar.c(listF0, intent);
        }
        activity.startActivityForResult(intent, mVar.q());
        Log.d("PickOrSavePlugin", "pickFile - OUT");
        System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
    }

    public static final void h(List<String> list, String str, boolean z10, boolean z11, Activity activity) {
        r.f(list, "allowedExtensions");
        r.f(str, "photoPickerMimeType");
        r.f(activity, "context");
        m mVar = new m();
        long jNanoTime = System.nanoTime();
        f23388a = list;
        f23389b = z10;
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        if (z11) {
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", MediaStore.getPickImagesMaxLimit());
        }
        intent.setType(str);
        activity.startActivityForResult(intent, mVar.q());
        Log.d("PickOrSavePlugin", "pickSingleOrMultiplePhoto - OUT");
        System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
    }

    public static final boolean i(int i10, Intent intent, Activity activity) {
        r.f(activity, "context");
        le.k.d(o0.a(d1.b()), null, null, new b(i10, intent, activity, null), 3, null);
        return true;
    }

    public static final boolean j(int i10, Intent intent, Activity activity) {
        r.f(activity, "context");
        le.k.d(o0.a(d1.c()), null, null, new c(i10, intent, activity, null), 3, null);
        return true;
    }
}
