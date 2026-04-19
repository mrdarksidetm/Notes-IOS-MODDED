package com.revenuecat.purchases.utils;

import ae.j;
import ae.r;
import ae.s;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.utils.Event;
import ie.g;
import ie.m;
import ie.o;
import md.i0;
import org.json.JSONObject;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public class EventsFileHelper<T extends Event> {
    private final l<String, T> eventDeserializer;
    private final FileHelper fileHelper;
    private final String filePath;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<g<? extends String>, i0> {
        final /* synthetic */ l<g<? extends T>, i0> $block;
        final /* synthetic */ EventsFileHelper<T> this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02111 extends s implements l<String, T> {
            final /* synthetic */ EventsFileHelper<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02111(EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override // zd.l
            public final T invoke(String str) {
                r.f(str, "line");
                return (T) this.this$0.mapToEvent(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super g<? extends T>, i0> lVar, EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$block = lVar;
            this.this$0 = eventsFileHelper;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(g<? extends String> gVar) {
            invoke2((g<String>) gVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g<String> gVar) {
            r.f(gVar, "sequence");
            this.$block.invoke(o.s(gVar, new C02111(this.this$0)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1, reason: invalid class name and case insensitive filesystem */
    static final class C07681 extends s implements l<g<? extends String>, i0> {
        final /* synthetic */ l<g<? extends JSONObject>, i0> $block;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02121 extends s implements l<String, JSONObject> {
            public static final C02121 INSTANCE = new C02121();

            C02121() {
                super(1);
            }

            @Override // zd.l
            public final JSONObject invoke(String str) {
                r.f(str, "it");
                return new JSONObject(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07681(l<? super g<? extends JSONObject>, i0> lVar) {
            super(1);
            this.$block = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(g<? extends String> gVar) {
            invoke2((g<String>) gVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g<String> gVar) {
            r.f(gVar, "sequence");
            this.$block.invoke(o.s(gVar, C02121.INSTANCE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventsFileHelper(FileHelper fileHelper, String str, l<? super String, ? extends T> lVar) {
        r.f(fileHelper, "fileHelper");
        r.f(str, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = str;
        this.eventDeserializer = lVar;
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, l lVar, int i10, j jVar) {
        this(fileHelper, str, (i10 & 4) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T mapToEvent(String str) {
        StringBuilder sb2;
        l<String, T> lVar = this.eventDeserializer;
        if (lVar == null) {
            return null;
        }
        try {
            return lVar.invoke(str);
        } catch (SerializationException e10) {
            e = e10;
            sb2 = new StringBuilder();
            sb2.append("Error parsing event from file: ");
            sb2.append(str);
            LogUtilsKt.errorLog(sb2.toString(), e);
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("Error parsing event from file: ");
            sb2.append(str);
            LogUtilsKt.errorLog(sb2.toString(), e);
            return null;
        }
    }

    public final synchronized void appendEvent(T t10) {
        r.f(t10, "event");
        FileHelper fileHelper = this.fileHelper;
        String str = this.filePath;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t10);
        sb2.append('\n');
        fileHelper.appendToFile(str, sb2.toString());
    }

    public final synchronized void clear(int i10) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, i10);
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogUtilsKt.verboseLog("Failed to delete events file in " + this.filePath + b.f7490a);
        }
    }

    public final synchronized void readFile(l<? super g<? extends T>, i0> lVar) {
        r.f(lVar, "block");
        if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
            lVar.invoke(m.e());
        } else {
            this.fileHelper.readFilePerLines(this.filePath, new AnonymousClass1(lVar, this));
        }
    }

    public final synchronized void readFileAsJson(l<? super g<? extends JSONObject>, i0> lVar) {
        r.f(lVar, "block");
        if (this.fileHelper.fileIsEmpty(this.filePath)) {
            lVar.invoke(m.e());
        } else {
            this.fileHelper.readFilePerLines(this.filePath, new C07681(lVar));
        }
    }
}
