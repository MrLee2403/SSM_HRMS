package com.oasis.lee.service.iservice;
import com.oasis.lee.dao.pojo.DimDTO;


import java.util.List;

public interface DimReportService {
    List<DimDTO> findDim (String begin,String end);
    //List<InfoBO> findDimBO (DateVO datevo);
}
