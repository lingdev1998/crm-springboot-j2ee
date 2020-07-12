package com.linkdoan.backend.dto;

import com.linkdoan.backend.base.anotation.AdjHistory;
import com.linkdoan.backend.base.dto.SystemDTO;
import com.linkdoan.backend.model.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO extends SystemDTO {

    private String subjectId;

    @AdjHistory(field = "subjectName")
    private String subjectName;

    @AdjHistory(field = "sectionId")
    private String sectionId;

    @AdjHistory(field = "type")
    private String type;

    @AdjHistory(field = "creditNumber")
    private String creditNumber;

    @AdjHistory(field = "theoryNumber")
    private String theoryNumber;

    @AdjHistory(field = "practiceNumber")
    private String practiceNumber;
    public Subject toModel(){
        Subject subject = new Subject();
        subject.setSubjectId(this.subjectId);
        subject.setSubjectName(this.subjectName);
        subject.setSectionId(this.sectionId);
        subject.setType(this.type);
        subject.setCreditNumber(this.creditNumber);
        subject.setTheoryNumber(this.theoryNumber);
        subject.setPracticeNumber(this.practiceNumber);
        return subject;
    }
}