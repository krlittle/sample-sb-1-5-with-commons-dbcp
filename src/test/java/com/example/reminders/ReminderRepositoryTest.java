package com.example.reminders;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReminderRepositoryTest {

    @Autowired
    private ReminderRepository reminders;

    @Test
    public void savesAndListsReminders() {
        reminders.save("call mom");

        assertThat(reminders.findAll()).hasSize(1);
        assertThat(reminders.findAll().get(0).getMessage()).isEqualTo("call mom");
    }
}
