import React from 'react';

import Series from './Series';

import '../../assets/css/series/SeriesPage.css';

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
          <div className='series-container container shadow bg-white'>
            <h2 className='series-title'>Series</h2>
            <div className='series'>
              {series}
            </div>
          </div>
        </div>
    );
}

export default SeriesPage;
