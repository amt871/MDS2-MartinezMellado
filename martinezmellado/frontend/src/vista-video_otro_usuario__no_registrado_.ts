import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-video_otro_usuario__no_registrado__item';

@customElement('vista-video_otro_usuario__no_registrado_')
export class VistaVideo_otro_usuario__no_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout style="width: 100%; height: 50%; justify-content: space-around; align-items: center;">
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; justify-content: space-around; align-items: center;">
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; justify-content: space-around; align-items: center;">
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
   <vista-video_otro_usuario__no_registrado__item></vista-video_otro_usuario__no_registrado__item>
  </vaadin-horizontal-layout>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
