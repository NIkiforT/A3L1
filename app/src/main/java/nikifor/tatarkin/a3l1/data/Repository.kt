package nikifor.tatarkin.a3l1.data

import nikifor.tatarkin.a3l1.data.entity.Note

object Repository {
    private val notes: List<Note> = listOf(
        Note(
            "Первая заметка",
            "ТЕкст моей заметки",
            0xff7FFFD4.toInt()),
        Note("Первая заметка",
            "ТЕкст моей заметки",
            0xfff06292.toInt()),
        Note("Первая заметка",
            "ТЕкст моей заметки",
            0xff9575cd.toInt()),
        Note("Первая заметка",
            "ТЕкст моей заметки",
            0xffED3CCA.toInt()),
        Note("Первая заметка",
            "ТЕкст моей заметки",
            0xff44944A.toInt()),
        Note("Первая заметка",
            "ТЕкст моей заметки",
            0xff3F888F.toInt()),
        Note("Первая заметка",
            "ТЕкст моей заметки",
            0xff4285B4.toInt()),
        Note("Первая заметка",
            "ТЕкст моей заметки",
            0xffFFDC33.toInt())
    )

    fun getNotes(): List<Note>{
        return notes
    }

}