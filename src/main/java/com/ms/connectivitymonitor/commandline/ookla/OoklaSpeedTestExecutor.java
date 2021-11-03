package com.ms.connectivitymonitor.commandline.ookla;

import com.ms.connectivitymonitor.entity.SpeedtestData;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface OoklaSpeedTestExecutor {
    Optional<SpeedtestData> execute();
}
