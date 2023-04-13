import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-videos_hashtag__no_registrado__item';

@customElement('vista-videos_hashtag__no_registrado_')
export class VistaVideos_hashtag__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; height: 100%;">
  <label>HashTag</label>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
   <vista-videos_hashtag__no_registrado__item></vista-videos_hashtag__no_registrado__item>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
