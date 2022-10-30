package com.charissa.recordstutorial;

import com.charissa.recordstutorial.Meeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class RecordsTutorialApplication {

	public static void main(String[] args) {

		MeetingRecord meetingRecord = new MeetingRecord("Je moeder ophalen");
		System.out.println(meetingRecord);

		SpringApplication.run(RecordsTutorialApplication.class, args);
	}

}
