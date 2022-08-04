import React from 'react';

import Series from './Series';

import '../../assets/css/series/Series.css';
import '../../assets/css/style.css';
import Pagination from '../Pagination';

const SeriesPage = () => {
    const series = [
        <Series />,
        <Series />,
        <Series />,
        <Series />,
        <Series />
    ];

    return (
        <div>
          <canvas className='series-background' />
          <div className='container shadow bg-white'>
            <h2 className='title'>Series</h2>
            <div className='movies'>
              {series}
            </div>
            <Pagination />
          </div>
        </div>
    );
}

export default SeriesPage;
