package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.d;
import io.flutter.embedding.android.f;
import io.flutter.embedding.android.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.b;

/* JADX INFO: loaded from: classes2.dex */
public class e implements f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.b f12818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<Long, Long> f12819b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<Long, g.e> f12820c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f.b f12821d = new f.b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12822a;

        static {
            int[] iArr = new int[d.b.values().length];
            f12822a = iArr;
            try {
                iArr[d.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12822a[d.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12822a[d.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(sc.b bVar) {
        this.f12818a = bVar;
        for (g.e eVar : g.a()) {
            this.f12820c.put(Long.valueOf(eVar.f12842c), eVar);
        }
    }

    private static d.b e(KeyEvent keyEvent) {
        boolean z10 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z10 ? d.b.kRepeat : d.b.kDown;
        }
        if (action == 1) {
            return d.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long f(KeyEvent keyEvent) {
        Long l10 = g.f12834b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l10 != null ? l10 : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    private Long g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l10 = g.f12833a.get(Long.valueOf(scanCode2));
            if (l10 != null) {
                return l10;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(j(scanCode, 73014444032L));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144 A[LOOP:2: B:69:0x013e->B:71:0x0144, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean i(android.view.KeyEvent r18, io.flutter.embedding.android.f.d.a r19) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.e.i(android.view.KeyEvent, io.flutter.embedding.android.f$d$a):boolean");
    }

    private static long j(long j10, long j11) {
        return (j10 & 4294967295L) | j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(f.d.a aVar, ByteBuffer byteBuffer) {
        Boolean boolValueOf = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            cc.b.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.a(boolValueOf.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(g.c cVar, long j10, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f12837b), Long.valueOf(j10), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(g.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f12837b), Long.valueOf(cVar.f12836a), keyEvent.getEventTime());
    }

    private void n(d dVar, final f.d.a aVar) {
        this.f12818a.b("flutter/keydata", dVar.a(), aVar == null ? null : new b.InterfaceC0419b() { // from class: dc.r
            @Override // sc.b.InterfaceC0419b
            public final void a(ByteBuffer byteBuffer) {
                io.flutter.embedding.android.e.k(aVar, byteBuffer);
            }
        });
    }

    private void q(boolean z10, Long l10, Long l11, long j10) {
        d dVar = new d();
        dVar.f12799a = j10;
        dVar.f12800b = z10 ? d.b.kDown : d.b.kUp;
        dVar.f12802d = l10.longValue();
        dVar.f12801c = l11.longValue();
        dVar.f12805g = null;
        dVar.f12803e = true;
        dVar.f12804f = d.a.kKeyboard;
        if (l11.longValue() != 0 && l10.longValue() != 0) {
            if (!z10) {
                l10 = null;
            }
            r(l11, l10);
        }
        n(dVar, null);
    }

    @Override // io.flutter.embedding.android.f.d
    public void a(KeyEvent keyEvent, f.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        q(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public Map<Long, Long> h() {
        return Collections.unmodifiableMap(this.f12819b);
    }

    void o(g.d dVar, boolean z10, long j10, final long j11, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        g.c[] cVarArr = dVar.f12839b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            g.c[] cVarArr2 = dVar.f12839b;
            boolean z12 = true;
            if (i10 >= cVarArr2.length) {
                break;
            }
            final g.c cVar = cVarArr2[i10];
            boolean zContainsKey = this.f12819b.containsKey(Long.valueOf(cVar.f12836a));
            zArr[i10] = zContainsKey;
            if (cVar.f12837b == j10) {
                int i11 = a.f12822a[e(keyEvent).ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    } else if (i11 == 3) {
                        if (!z10) {
                            arrayList.add(new Runnable() { // from class: dc.t
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f10021a.m(cVar, keyEvent);
                                }
                            });
                        }
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    }
                    i10++;
                } else {
                    boolArr[i10] = Boolean.FALSE;
                    if (!z10) {
                        arrayList.add(new Runnable() { // from class: dc.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f10017a.l(cVar, j11, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z11 && !zContainsKey) {
                z12 = false;
            }
            z11 = z12;
            i10++;
        }
        if (z10) {
            for (int i12 = 0; i12 < dVar.f12839b.length; i12++) {
                if (boolArr[i12] == null) {
                    if (z11) {
                        boolArr[i12] = Boolean.valueOf(zArr[i12]);
                    } else {
                        boolArr[i12] = Boolean.TRUE;
                        z11 = true;
                    }
                }
            }
            if (!z11) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i13 = 0; i13 < dVar.f12839b.length; i13++) {
                if (boolArr[i13] == null) {
                    boolArr[i13] = Boolean.FALSE;
                }
            }
        }
        for (int i14 = 0; i14 < dVar.f12839b.length; i14++) {
            if (zArr[i14] != boolArr[i14].booleanValue()) {
                g.c cVar2 = dVar.f12839b[i14];
                q(boolArr[i14].booleanValue(), Long.valueOf(cVar2.f12837b), Long.valueOf(cVar2.f12836a), keyEvent.getEventTime());
            }
        }
    }

    void p(g.e eVar, boolean z10, long j10, KeyEvent keyEvent) {
        if (eVar.f12842c == j10 || eVar.f12843d == z10) {
            return;
        }
        boolean z11 = !this.f12819b.containsKey(Long.valueOf(eVar.f12841b));
        if (z11) {
            eVar.f12843d = !eVar.f12843d;
        }
        q(z11, Long.valueOf(eVar.f12842c), Long.valueOf(eVar.f12841b), keyEvent.getEventTime());
        if (!z11) {
            eVar.f12843d = !eVar.f12843d;
        }
        q(!z11, Long.valueOf(eVar.f12842c), Long.valueOf(eVar.f12841b), keyEvent.getEventTime());
    }

    void r(Long l10, Long l11) {
        if (l11 != null) {
            if (this.f12819b.put(l10, l11) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f12819b.remove(l10) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
